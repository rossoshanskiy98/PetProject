package com.example.petproject.rest;

import com.example.petproject.model.DailyReport;
import com.example.petproject.service.DailyReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
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
@RequestMapping("/api/v1/dailyreport")
public class DailyReportRestController {

    public final DailyReportService dailyReportService;

    @GetMapping("/{id}")
    public ResponseEntity<DailyReport> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(dailyReportService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<DailyReport>> findAll() {
        return ResponseEntity.ok(dailyReportService.findAll());
    }

    @PostMapping
    public ResponseEntity<DailyReport> save(@RequestBody DailyReport dailyReport) {
        return ResponseEntity.ok(dailyReportService.save(dailyReport));
    }

    @PutMapping
    public ResponseEntity<DailyReport> update(@RequestBody DailyReport dailyReport) {
        return ResponseEntity.ok(dailyReportService.update(dailyReport));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        dailyReportService.delete(dailyReportService.findById(id));
    }
}
