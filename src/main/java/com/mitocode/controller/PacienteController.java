package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Paciente;
import com.mitocode.service.IPacienteService;
import com.mitocode.service.PacienteServiceImpl;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService service;// = new PacienteServiceImpl();
	
	@GetMapping
	public String saludar() {
		Paciente p = new Paciente(1,"Hola Mito"); 
		return service.saludar(p);
	} 
}
