package com.project.saloonAPI.services;

import com.project.saloonAPI.models.SalonService;
import com.project.saloonAPI.repositories.SalonServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalonServiceServices {
    @Autowired
    private SalonServiceRepository salonServiceRepo;

    public SalonService addService(SalonService ss){
        return salonServiceRepo.save(ss);
    }

    public List<SalonService> getAll(){
        return salonServiceRepo.findAll();
    }

    public Optional<SalonService> findById(Long id){
        return salonServiceRepo.findById(id);
    }

    public void deleteById(Long id){
        salonServiceRepo.deleteById(id);
    }
}
