package com.example.petproject.rest;

import com.example.petproject.model.MainChemicals;
import com.example.petproject.model.WellChemicals;
import com.example.petproject.service.MainChemicalsService;
import com.example.petproject.service.WellChemicalsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/wellchemicals")
@RequiredArgsConstructor
public class WellChemicalsRestController {

    private final WellChemicalsService wellChemicalsService;

    @GetMapping("/{id}")
    public ResponseEntity<WellChemicals> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(wellChemicalsService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<WellChemicals>> findAll() {
        return ResponseEntity.ok(wellChemicalsService.findAll());
    }

    @GetMapping("/search")
    public ResponseEntity<WellChemicals> find(@RequestParam(value = "field", required = false) String field,
                                                            @RequestParam(value = "well", required = false) Integer well) {
        return ResponseEntity.ok(wellChemicalsService.findByFieldAndWell(field, well));
    }

    @PostMapping
    public ResponseEntity<WellChemicals> save(@RequestBody WellChemicals wellChemicals) {
        return ResponseEntity.ok(wellChemicalsService.save(wellChemicals));
    }

    @PutMapping
    public ResponseEntity<WellChemicals> update(@RequestBody WellChemicals wellChemicals) {
        return ResponseEntity.ok(wellChemicalsService.update(wellChemicals));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        wellChemicalsService.delete(wellChemicalsService.findById(id));
    }
}
