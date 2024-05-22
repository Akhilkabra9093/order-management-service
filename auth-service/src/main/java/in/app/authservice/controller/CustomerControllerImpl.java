package in.app.authservice.controller;

import org.springframework.web.bind.annotation.RestController;
import in.app.authservice.model.request.CustomerDTO;
import in.app.authservice.controller.routes.CustomerController;

@RestController
public class CustomerControllerImpl implements CustomerController{
    @Override
    public void saveCustomer(CustomerDTO customerDTO){
        System.out.println(":Inside the save customer call");
    }

}