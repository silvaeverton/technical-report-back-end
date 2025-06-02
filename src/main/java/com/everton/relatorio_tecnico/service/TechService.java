package com.everton.relatorio_tecnico.service;

import com.everton.relatorio_tecnico.dtos.TechDTO;
import com.everton.relatorio_tecnico.model.Tech;

import java.util.List;

public interface TechService {

    public Tech createTech(TechDTO techDTO);
    public List<Tech> allTech();
    public Tech updateTech(Long idTech, TechDTO techDTO);
    public Tech findById(Long idTech);
    public void deleteTech(Long idTech);
}
