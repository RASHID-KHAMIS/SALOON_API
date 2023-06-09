package com.project.saloonAPI.services;

import com.project.saloonAPI.models.Appointment;
import com.project.saloonAPI.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServices {
    @Autowired
    private AppointmentRepository appointmentRepo;

    public Appointment addAppointment(Appointment s){
        return appointmentRepo.save(s);
    }

    public List<Appointment> getAll(){
        return appointmentRepo.findAll();
    }

    public List<Appointment> getCustByApp(Long id){
        return appointmentRepo.getCustApp(id);
    }

    public Optional<Appointment> findById(Long id){
        return appointmentRepo.findById(id);
    }

    public void deleteById(Long id){
        appointmentRepo.deleteById(id);
    }
}
