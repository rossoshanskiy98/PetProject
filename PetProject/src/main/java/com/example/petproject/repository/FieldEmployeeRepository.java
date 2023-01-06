package com.example.petproject.repository;

import com.example.petproject.model.FieldEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldEmployeeRepository extends JpaRepository<FieldEmployee, Long> {
}
