package in.app.authservice.controller.routes;

import in.app.authservice.model.request.CustomerDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface CustomerController{
    @PostMapping("api/customer/save")
    void saveCustomer(@RequestBody final CustomerDTO customerDTO);

}