package com.generation.EscolaGeneration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.EscolaGeneration.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{
	
}
