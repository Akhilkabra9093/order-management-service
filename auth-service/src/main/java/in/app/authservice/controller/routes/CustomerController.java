package in.app.authservice.controller.routes

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public non-sealed interface CustomerController{
    @PostMappping("api/customer/save")
    void saveCustomer(@RequestBody final CustomerDTO customerDTO);

}