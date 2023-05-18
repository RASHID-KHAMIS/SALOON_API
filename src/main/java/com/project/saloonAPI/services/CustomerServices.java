package com.project.saloonAPI.services;

import com.project.saloonAPI.models.Customer;
import com.project.saloonAPI.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {
    @Autowired
    private CustomerRepository customerRepo;

    public List<Customer> getCustomerByName(String name){
        List<Customer> c = customerRepo.getCustomerForNames(name);
        if(c.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Customer was not found");
        }else{
            return c;
        }
    }

    public Customer addCustomer(Customer s){
        return customerRepo.save(s);
    }

    public List<Customer> getAll(){
        return customerRepo.findAll();
    }

    public Optional<Customer> findById(Long id){
        return customerRepo.findById(id);
    }

    public void deleteById(Long id){
        customerRepo.deleteById(id);
    }
}
