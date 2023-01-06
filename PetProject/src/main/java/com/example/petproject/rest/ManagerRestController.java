package com.example.petproject.rest;

import com.example.petproject.model.MainChemicals;
import com.example.petproject.model.Manager;
import com.example.petproject.service.MainChemicalsService;
import com.example.petproject.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/manager")
public class ManagerRestController {

    private final ManagerService managerService;

    @GetMapping("/{id}")
    public ResponseEntity<Manager> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(managerService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Manager>> findAll() {
        return ResponseEntity.ok(managerService.findAll());
    }

    @PostMapping
    public ResponseEntity<Manager> save(@RequestBody Manager manager) {
        return ResponseEntity.ok(managerService.save(manager));
    }

    @PutMapping
    public ResponseEntity<Manager> update(@RequestBody Manager manager) {
        return ResponseEntity.ok(managerService.update(manager));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        managerService.delete(managerService.findById(id));
    }
}
