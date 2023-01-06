package com.example.petproject.service;

import com.example.petproject.model.DailyReport;
import com.example.petproject.repository.DailyReportRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@NoArgsConstructor
public class DailyReportService implements AbstractService<DailyReport> {

    private DailyReportRepository dailyReportRepository;

    @Autowired
    public DailyReportService(DailyReportRepository dailyReportRepository) {
        this.dailyReportRepository = dailyReportRepository;
    }

    @Override
    @Transactional
    public DailyReport findById(Long id) {
        return dailyReportRepository.findById(id).get();
    }

    @Override
    @Transactional
    public DailyReport save(DailyReport dailyReport) {
        return dailyReportRepository.save(dailyReport);
    }

    @Override
    @Transactional
    public DailyReport update(DailyReport dailyReport) {
        return dailyReportRepository.saveAndFlush(dailyReport);
    }

    @Override
    @Transactional
    public void delete(DailyReport dailyReport) {
        dailyReportRepository.delete(dailyReport);
    }

    @Override
    @Transactional
    public List<DailyReport> findAll() {
        return dailyReportRepository.findAll();
    }


}
