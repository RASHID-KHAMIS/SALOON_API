package com.project.saloonAPI.repositories;

import com.project.saloonAPI.models.ServiceRendered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRenderedRepository extends JpaRepository<ServiceRendered,Long> {
}
