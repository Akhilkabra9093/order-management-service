package in.app.authservice.service;

import in.app.authservice.enums.Gender;
import in.app.authservice.helper.Constants;
import in.app.authservice.helper.CustomerHelper;
import in.app.authservice.model.entity.Customer;
import in.app.authservice.model.request.CustomerDTO;
import in.app.authservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerHelper customerHelper;

    public Object createCustomer(CustomerDTO customerDTO) {
        if(!checkCustomer(customerDTO.getEmail()).equalsIgnoreCase(Constants.OK))
          return Constants.EMAIL_ALREADY_EXIST;
        if(customerDTO.getPhoneNumber().length() != 10)
            return Constants.INVALID_PHONE_NUMBER;

        return customerRepository.save(customerHelper.makeCustomer(customerDTO));
    }
    @Transactional
    public String checkCustomer(String email){
        if(customerRepository.findByEmail(email).isPresent()){
           return "Customer already exist with this emailId :: " + email;
        }
       return Constants.OK;
    }

}