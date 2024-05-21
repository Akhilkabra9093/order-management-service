package in.app.authservice.controller.routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import in.app.authservice.model.request.CustomerDTO;

@RestController
public interface CustomerController{
    @PostMapping("api/customer/save")
    void saveCustomer(@RequestBody final CustomerDTO customerDTO);

}