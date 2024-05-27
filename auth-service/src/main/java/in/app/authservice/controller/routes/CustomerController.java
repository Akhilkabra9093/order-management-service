package in.app.authservice.controller.routes;

import in.app.authservice.model.request.CustomerDTO;
import in.app.authservice.model.request.EmailCheck;
import in.app.authservice.model.request.LoginCred;
import in.app.authservice.model.request.UpdatePassword;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface CustomerController{
    @PostMapping("api/customer/create")
    Object saveCustomer(@RequestBody final CustomerDTO customerDTO);

    @PostMapping("api/customer/check")
    ResponseEntity<String> checkCustomer(@RequestBody final EmailCheck emailCheck);

    @PostMapping("api/customer/login")
    ResponseEntity<String> loginCustomer(@RequestBody final LoginCred loginCred);

    @PostMapping("api/customer/password/update")
    ResponseEntity<String> newPassword(@RequestBody final UpdatePassword updatePassword);
}