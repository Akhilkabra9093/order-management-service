package in.app.authservice.controller;

import in.app.authservice.helper.Constants;
import in.app.authservice.model.request.EmailCheck;
import in.app.authservice.model.request.LoginCred;
import in.app.authservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.app.authservice.model.request.CustomerDTO;
import in.app.authservice.controller.routes.CustomerController;

@RestController
public class CustomerControllerImpl implements CustomerController{

    @Autowired
    CustomerService customerService;
    @Override
    public ResponseEntity<Object> saveCustomer(CustomerDTO customerDTO){
        System.out.println(":Inside the save customer call");
        return new ResponseEntity<>(customerService.createCustomer(customerDTO) , HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> checkCustomer(EmailCheck emailCheck){
        System.out.println(":Inside the check customer call");
        String response = customerService.checkCustomer(emailCheck.getEmail());
        if(response.equalsIgnoreCase(Constants.OK)){
            return new ResponseEntity<>("Email does not exist" , HttpStatus.OK);
        }else{
            return new ResponseEntity<>(response , HttpStatus.BAD_REQUEST);
        }
    }
    @Override
    public ResponseEntity<String> loginCustomer(LoginCred loginCred){
        System.out.println(":Inside the login customer call");
        boolean response = customerService.loginUser(loginCred);
        if(response){
            return new ResponseEntity<>("Login successful" , HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Login failed" , HttpStatus.BAD_REQUEST);
        }
    }

}