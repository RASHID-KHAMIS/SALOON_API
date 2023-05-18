package com.project.saloonAPI.contrallers;

import com.project.saloonAPI.models.SalonService;
import com.project.saloonAPI.services.SalonServiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/salonService")
public class SalonServiceContraller {
    @Autowired
    private SalonServiceServices salonServiceService;

    @PostMapping("/")
    public SalonService addSalonService(@RequestBody SalonService s){
        return salonServiceService.addService(s);
    }

    @GetMapping("/")
    public List<SalonService> getAll(){
        return salonServiceService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<SalonService> getById(@PathVariable Long id){
        return salonServiceService.findById(id);
    }

    @PutMapping("/{id}")
    public SalonService updateSalonService(@RequestBody SalonService s, @PathVariable Long id){
        s.setId(id);
        return salonServiceService.addService(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        salonServiceService.deleteById(id);
    }
}
