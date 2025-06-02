package com.everton.relatorio_tecnico.controllers;

import com.everton.relatorio_tecnico.dtos.ReportDTO;
import com.everton.relatorio_tecnico.model.Report;
import com.everton.relatorio_tecnico.service.ReportService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequestMapping("/report")
@RequiredArgsConstructor
public class ReportController {



    private final ReportService service;

    private final ModelMapper mapper;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseStatus(HttpStatus.CREATED)
    public ReportDTO createReport(@RequestBody @Valid ReportDTO reportDTO) {

        Report report = service.create(reportDTO);
        return mapper.map(report,ReportDTO.class);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ReportDTO> findAllReport(){
        return service.findAll().stream().map(
                report -> mapper.map(report,ReportDTO.class)
        ).collect(Collectors.toList());
    }


    @GetMapping("/{idTech}")
    @ResponseStatus(HttpStatus.OK)
    public List<Report> findByTech(@PathVariable Long idTech) {
        return service.findByTech(idTech);
    }

    @GetMapping("/reports/{idReport}")
    @ResponseStatus(HttpStatus.OK)
    public ReportDTO findByReportId(@PathVariable Long idReport) {
        Report report = service.findById(idReport);
        return mapper.map(report,ReportDTO.class);
    }
}


