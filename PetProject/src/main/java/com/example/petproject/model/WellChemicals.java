package com.example.petproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WellChemicals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String field;

    private Integer well;

    private Integer CARB;

    private Integer LUBE;

    private Integer ASR;

    private Integer XAN;
}
