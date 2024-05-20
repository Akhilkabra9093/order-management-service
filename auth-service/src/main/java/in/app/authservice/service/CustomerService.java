package in.app.authservice.service

import in.app.authservice.model.Customer;
import in.app.authservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerService customerService;

    public Customer saveCustomer(Customer customer) {
        return customerService.save(customer);
    }

}