package com.project.saloonAPI.contrallers;

import com.project.saloonAPI.models.Appointment;
import com.project.saloonAPI.services.AppointmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/appointment")
public class AppointmentContraller {
    @Autowired
    private AppointmentServices appointmentService;

    @PostMapping("/")
    public Appointment addAppointment(@RequestBody Appointment s){
        return appointmentService.addAppointment(s);
    }

    @GetMapping("/")
    public List<Appointment> getAll(){
        return appointmentService.getAll();
    }

    @GetMapping("/getCustByApp/{id}")
    public List<Appointment> getACustByApp(@PathVariable("id") Long id){
        return appointmentService.getCustByApp(id);
    }

    @GetMapping("/{id}")
    public Optional<Appointment> getById(@PathVariable Long id){
        return appointmentService.findById(id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointment(@RequestBody Appointment s,@PathVariable Long id){
        s.setId(id);
        return appointmentService.addAppointment(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        appointmentService.deleteById(id);
    }
}
