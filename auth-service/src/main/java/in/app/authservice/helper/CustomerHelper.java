package in.app.authservice.helper;

import in.app.authservice.enums.Gender;
import in.app.authservice.model.entity.Customer;
import in.app.authservice.model.request.CustomerDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CustomerHelper {

    public Customer makeCustomer(CustomerDTO customerDTO){
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setAddress(customerDTO.getAddress());
        customer.setPhoneNumber(customerDTO.getPhoneNumber());
        if (customerDTO.getGender().equalsIgnoreCase("M")) {
            customer.setGender(String.valueOf(Gender.MALE));
        } else {
            customer.setGender(String.valueOf(Gender.FEMALE));
        }
        customer.setCreatedAt(LocalDateTime.now());
        return customer;
    }
}
