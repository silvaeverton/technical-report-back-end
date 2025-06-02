package com.everton.relatorio_tecnico.repositories;

import com.everton.relatorio_tecnico.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long> {
    List<Report> findByTech_Id(Long techId);
}
