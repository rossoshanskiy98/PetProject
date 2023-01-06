package com.example.petproject.service;

import com.example.petproject.model.WellChemicals;
import com.example.petproject.repository.WellChemicalsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class WellChemicalsService implements AbstractService<WellChemicals> {

    private final WellChemicalsRepository wellChemicalsRepository;
    @Override
    public WellChemicals findById(Long id) {
        return wellChemicalsRepository.findById(id).get();
    }

    @Override
    public WellChemicals save(WellChemicals wellChemicals) {
        return wellChemicalsRepository.save(wellChemicals);
    }

    @Override
    public WellChemicals update(WellChemicals wellChemicals) {
        return wellChemicalsRepository.saveAndFlush(wellChemicals);
    }

    @Override
    public void delete(WellChemicals wellChemicals) {
        wellChemicalsRepository.delete(wellChemicals);
    }

    @Override
    public List<WellChemicals> findAll() {
        return wellChemicalsRepository.findAll();
    }

    public WellChemicals findByFieldAndWell(String field, Integer well) {
        return wellChemicalsRepository.findByFieldAndWell(field, well).get();
    }
}
