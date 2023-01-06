package com.example.petproject.repository;

import com.example.petproject.model.DailyReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface DailyReportRepository extends JpaRepository<DailyReport, Long> {

//    @Query("update DailyReport" +
//            "set pv = :pv," +
//            "dns = :dns," +
//            "typeOfWorks = :typeOfWorks" +
//            "where id = :id")
//    DailyReport update(Long id, DailyReport dailyReport);
}
