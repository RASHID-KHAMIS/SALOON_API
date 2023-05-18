package com.project.saloonAPI.services;

import com.project.saloonAPI.models.ServiceRendered;
import com.project.saloonAPI.repositories.ServiceRenderedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceRenderedServices {
    @Autowired
    private ServiceRenderedRepository serviceRenderedRepo;

    public ServiceRendered addServiceRendered(ServiceRendered s){
        return serviceRenderedRepo.save(s);
    }

    public List<ServiceRendered> getAll(){
        return serviceRenderedRepo.findAll();
    }

    public Optional<ServiceRendered> findById(Long id){
        return serviceRenderedRepo.findById(id);
    }

    public void deleteById(Long id){
        serviceRenderedRepo.deleteById(id);
    }
}
