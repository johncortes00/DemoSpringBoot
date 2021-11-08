package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mitocode.model.Paciente;
import com.mitocode.repo.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService {
	@Autowired
	@Qualifier("")
	private IPacienteRepo repo;// = new PacienteRepoImpl();

	@Override
	public String saludar(Paciente paciente) {
		
		return repo.saludar(paciente);		
	}

}
