package com.project.saloonAPI.contrallers;

import com.project.saloonAPI.models.ServiceRendered;
import com.project.saloonAPI.services.ServiceRenderedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/serviceRendered")
public class ServceRenderedContraller {
    @Autowired
    private ServiceRenderedServices serviceRenderedService;

    @PostMapping
    public ServiceRendered addServiceRendered(@RequestBody ServiceRendered s){
        return serviceRenderedService.addServiceRendered(s);
    }

    @GetMapping
    public List<ServiceRendered> getAll(){
        return serviceRenderedService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<ServiceRendered> getById(@PathVariable Long id){
        return serviceRenderedService.findById(id);
    }

    @PutMapping("/{id}")
    public ServiceRendered updateServiceRendered(@RequestBody ServiceRendered s,@PathVariable Long id){
        s.setId(id);
        return serviceRenderedService.addServiceRendered(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        serviceRenderedService.deleteById(id);
    }
}
