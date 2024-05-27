package in.app.authservice.service;

import in.app.authservice.enums.Gender;
import in.app.authservice.helper.Constants;
import in.app.authservice.helper.CustomerHelper;
import in.app.authservice.model.entity.Customer;
import in.app.authservice.model.entity.Password;
import in.app.authservice.model.request.CustomerDTO;
import in.app.authservice.model.request.LoginCred;
import in.app.authservice.repository.CustomerRepository;
import in.app.authservice.repository.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerHelper customerHelper;
    @Autowired
    private PasswordRepository passwordRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public Object createCustomer(CustomerDTO customerDTO) {
        if ((!checkCustomer(customerDTO.getEmail()).equalsIgnoreCase(Constants.OK)) || !checkPassword(customerDTO.getEmail()).equalsIgnoreCase(Constants.OK))
            return Constants.EMAIL_ALREADY_EXIST;
        if (customerDTO.getPhoneNumber().length() != 10)
            return Constants.INVALID_PHONE_NUMBER;
        if (customerDTO.getPassword().isEmpty() || customerDTO.getPassword().length() < 7)
            return Constants.INVALID_PASSWORD;

        savePassword(customerDTO.getPassword(), customerDTO.getEmail());
        return customerRepository.save(customerHelper.makeCustomer(customerDTO));
    }

    @Transactional
    public String checkCustomer(String email) {
        if (customerRepository.findByEmail(email).isPresent()) {
            return "Customer already exist with this emailId :: " + email;
        }
        return Constants.OK;
    }

    @Transactional
    public String checkPassword(String email) {
        if (passwordRepository.findByUsername(email).isPresent()) {
            return "Customer already exist with this emailId :: " + email;
        }
        return Constants.OK;
    }

    public void savePassword(String password, String email) {
        String encodedPassword = passwordEncoder.encodePassword(password);
        Password password1 = customerHelper.makePassword(email, encodedPassword);
        passwordRepository.saveAndFlush(password1);
    }

    public boolean loginUser(LoginCred loginCred){
        Optional<Password> password = passwordRepository.findByUsername(loginCred.getUsername());
        if(password.isPresent()){
            String encodedPasswordDb = password.get().getPassword();
            return passwordEncoder.verifyPassword(loginCred.getPassword(), encodedPasswordDb);
        }
        return false;
    }

}