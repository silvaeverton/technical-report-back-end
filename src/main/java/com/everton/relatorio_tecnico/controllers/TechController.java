package com.everton.relatorio_tecnico.controllers;

import com.everton.relatorio_tecnico.dtos.TechDTO;
import com.everton.relatorio_tecnico.model.Tech;
import com.everton.relatorio_tecnico.service.TechService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/tech")
@RequiredArgsConstructor
public class TechController {

    private final TechService service;

    private final ModelMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TechDTO createTech (@RequestBody @Valid TechDTO techDTO) {
        Tech tech = service.createTech(techDTO);
        return mapper.map(tech,TechDTO.class);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Tech> allTechs() {
        return service.allTech();
    }

    @PutMapping("/{idTech}")
    @ResponseStatus(HttpStatus.OK)
    public Tech updateTech(@PathVariable Long idTech, @RequestBody @Valid TechDTO techDTO) {
        return service.updateTech(idTech, techDTO);

    }

    @DeleteMapping("/{idTech}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTech(@PathVariable Long idTech) {
        service.deleteTech(idTech);
    }
}
