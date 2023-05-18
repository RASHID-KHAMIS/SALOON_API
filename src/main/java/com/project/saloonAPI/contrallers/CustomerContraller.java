package com.project.saloonAPI.contrallers;

import com.project.saloonAPI.models.Customer;
import com.project.saloonAPI.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/customer")
public class CustomerContraller {
    @Autowired
    private CustomerServices customerService;


    @GetMapping("/getCustomerByName/{name}")
    public List<Customer> getCustomerByName(@PathVariable("name") String name){
        List<Customer> c = customerService.getCustomerByName(name);
        return c;
    }
    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer s){
        return customerService.addCustomer(s);
    }

    @GetMapping("/")
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer s,@PathVariable Long id){
        s.setId(id);
        return customerService.addCustomer(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        customerService.deleteById(id);
    }
}
