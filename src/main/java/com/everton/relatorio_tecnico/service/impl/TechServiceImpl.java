package com.everton.relatorio_tecnico.service.impl;

import com.everton.relatorio_tecnico.dtos.TechDTO;
import com.everton.relatorio_tecnico.exceptions.NotFoundException;
import com.everton.relatorio_tecnico.model.Tech;
import com.everton.relatorio_tecnico.repositories.TechRepository;
import com.everton.relatorio_tecnico.service.TechService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechServiceImpl implements TechService {

    private final TechRepository repository;

    public final ModelMapper mapper;

    @Override
    public Tech createTech(TechDTO techDTO) {

        return repository.saveAndFlush(mapper.map(techDTO, Tech.class));
    }

    @Override
    public List<Tech> allTech() {
        if (repository.findAll().isEmpty()) {
            throw new NotFoundException("List is Empty", 400);
        } else {
            return repository.findAll();
        }

    }

    @Override
    public Tech updateTech(Long idTech, TechDTO techDTO) {
        Tech techExist = findById(idTech);
        Tech update = mapper.map(techDTO, Tech.class);

        if (update.getName()!=null) techExist.setName(update.getName());
        if (update.getEmail()!=null) techExist.setEmail(update.getEmail());
        if (update.getPhone()!=null) techExist.setPhone(update.getPhone());

        return repository.saveAndFlush(techExist);
    }

    @Override
    public Tech findById(Long idTech) {

        return repository.findById(idTech).orElseThrow(() ->
                new NotFoundException("Tech not found", 404));
    }

    @Override
    public void deleteTech(Long idTech) {

        repository.deleteById(idTech);

    }
}
