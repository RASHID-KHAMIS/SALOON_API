package com.project.saloonAPI.repositories;

import com.project.saloonAPI.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    @Query(value = "select * from customer where first_name = ?1",nativeQuery = true)
    List<Customer> getCustomerForNames(String name);
}
