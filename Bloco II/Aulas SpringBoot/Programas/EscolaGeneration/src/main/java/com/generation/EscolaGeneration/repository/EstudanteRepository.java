package com.generation.EscolaGeneration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.EscolaGeneration.model.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long>{
	
}
