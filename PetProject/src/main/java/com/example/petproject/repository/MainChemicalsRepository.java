package com.example.petproject.repository;

import com.example.petproject.model.MainChemicals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainChemicalsRepository extends JpaRepository<MainChemicals, Long> {
}
