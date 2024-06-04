package in.app.authservice.controller.routes;

import in.app.authservice.model.request.CustomerDTO;
import in.app.authservice.model.request.EmailCheck;
import in.app.authservice.model.request.LoginCred;
import in.app.authservice.model.request.UpdatePassword;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/customers")
public interface CustomerController{
    @PostMapping("/create")
    Object saveCustomer(@RequestBody final CustomerDTO customerDTO);

    @PostMapping("/check")
    ResponseEntity<String> checkCustomer(@RequestBody final EmailCheck emailCheck);

    @PostMapping("/login")
    ResponseEntity<String> loginCustomer(@RequestBody final LoginCred loginCred);

    @PostMapping("/password/update")
    ResponseEntity<String> newPassword(@RequestBody final UpdatePassword updatePassword);
}