package com.example.petproject.rest;

import com.example.petproject.model.DailyReport;
import com.example.petproject.model.MainChemicals;
import com.example.petproject.service.MainChemicalsService;
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
@RequestMapping("api/v1/mainchemicals")
public class MainChemicalsRestController {

    private final MainChemicalsService mainChemicalsService;

    @GetMapping("/{id}")
    public ResponseEntity<MainChemicals> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(mainChemicalsService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<MainChemicals>> findAll() {
        return ResponseEntity.ok(mainChemicalsService.findAll());
    }

    @PostMapping
    public ResponseEntity<MainChemicals> save(@RequestBody MainChemicals mainChemicals) {
        return ResponseEntity.ok(mainChemicalsService.save(mainChemicals));
    }

    @PutMapping
    public ResponseEntity<MainChemicals> update(@RequestBody MainChemicals mainChemicals) {
        return ResponseEntity.ok(mainChemicalsService.update(mainChemicals));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        mainChemicalsService.delete(mainChemicalsService.findById(id));
    }
}

