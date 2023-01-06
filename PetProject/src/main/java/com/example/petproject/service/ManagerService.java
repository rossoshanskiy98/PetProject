package com.example.petproject.service;

import com.example.petproject.model.MainChemicals;
import com.example.petproject.model.Manager;
import com.example.petproject.repository.MainChemicalsRepository;
import com.example.petproject.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagerService implements AbstractService<Manager>{

    private final ManagerRepository managerRepository;
    @Override
    public Manager findById(Long id) {
        return managerRepository.findById(id).get();
    }

    @Override
    public Manager save(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public Manager update(Manager manager) {
        return managerRepository.saveAndFlush(manager);
    }

    @Override
    public void delete(Manager manager) {
        managerRepository.delete(manager);
    }

    @Override
    public List<Manager> findAll() {
        return managerRepository.findAll();
    }

}
