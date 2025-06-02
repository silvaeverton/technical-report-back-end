package com.everton.relatorio_tecnico.service;

import com.everton.relatorio_tecnico.dtos.ReportDTO;
import com.everton.relatorio_tecnico.model.Report;

import java.util.List;

public interface ReportService {

    public Report create(ReportDTO dto);
    public List<Report>findAll();
    public List<Report> findByTech(Long tech_id);
    public Report findById(Long idReport);
}
