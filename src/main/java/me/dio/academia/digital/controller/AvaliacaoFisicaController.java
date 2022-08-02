package me.dio.academia.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
	
	@Autowired
	private IAvaliacaoFisicaService avaliacaoFisicaService;
	
	@PostMapping
	public AvaliacaoFisica criarAvaliacao(@RequestBody AvaliacaoFisicaForm form) {
		return avaliacaoFisicaService.create(form);
		
	}
	
	
}
