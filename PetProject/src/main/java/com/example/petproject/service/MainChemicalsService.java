package com.example.petproject.service;

import com.example.petproject.model.MainChemicals;
import com.example.petproject.model.WellChemicals;
import com.example.petproject.repository.MainChemicalsRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MainChemicalsService implements AbstractService<MainChemicals> {

    private final MainChemicalsRepository mainChemicalsRepository;
    @Override
    public MainChemicals findById(Long id) {
        return mainChemicalsRepository.findById(id).get();
    }

    @Override
    public MainChemicals save(MainChemicals mainChemicals) {
        return mainChemicalsRepository.save(mainChemicals);
    }

    @Override
    public MainChemicals update(MainChemicals mainChemicals) {
        return mainChemicalsRepository.saveAndFlush(mainChemicals);
    }

    @Override
    public void delete(MainChemicals mainChemicals) {
        mainChemicalsRepository.delete(mainChemicals);
    }

    @Override
    public List<MainChemicals> findAll() {
        return mainChemicalsRepository.findAll();
    }
}
