package com.everton.relatorio_tecnico.repositories;

import com.everton.relatorio_tecnico.model.Tech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechRepository extends JpaRepository<Tech,Long> {
}
