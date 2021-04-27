package com.helloword.objetivosaprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivosAprendizagemController {
	
	@GetMapping
	public String ObjetivosAprendizagem() {
		return "Objetivos de Aprendizagem da Semana: \n"
				+ "Aprender ainda mais sobre Back e aplicar todo esse conhecimento em varios desafios que iram aparecer daqui pra frente !!!\n"
				+ "Estou muito animado para aprender mais e aplicar todo esse conhecimento !!!!";
	}
}
