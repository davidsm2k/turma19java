package com.generation.junit2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.junit2.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{
	
}
