package in.app.authservice.controller.routes;

import in.app.authservice.model.request.CustomerDTO;
import in.app.authservice.model.request.EmailCheck;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface CustomerController{
    @PostMapping("api/customer/create")
    Object saveCustomer(@RequestBody final CustomerDTO customerDTO);

    @PostMapping("api/customer/check")
    ResponseEntity<String> checkCustomer(@RequestBody final EmailCheck emailCheck);

}