package com.helloword.habilidadesmentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidade-mentalidades")
public class HabilidadesMentalidadesController {
	
	@GetMapping
	public String HabiliadesMentalidades() {
		return "Mentalidade: Persistência e Crescimento\n" + 
				"Habilidade: Atenção aos Detalhes";
	}
}
