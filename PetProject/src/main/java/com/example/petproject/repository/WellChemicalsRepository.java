package com.example.petproject.repository;

import com.example.petproject.model.WellChemicals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WellChemicalsRepository extends JpaRepository<WellChemicals, Long> {

    @Query("select wc from WellChemicals wc where wc.field = :field and wc.well = :well")
    public Optional<WellChemicals> findByFieldAndWell(String field, Integer well);
}
