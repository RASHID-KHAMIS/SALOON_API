package com.project.saloonAPI.repositories;

import com.project.saloonAPI.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
    @Query(value = "Select * from appointment where  customer_customer_id=?1",nativeQuery = true)
    List<Appointment> getCustApp(Long id);
}
