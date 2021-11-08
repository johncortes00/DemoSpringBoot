package com.mitocode.repo;

import org.springframework.stereotype.Repository;

import com.mitocode.model.Paciente;

@Repository

public class PacienteRepoImpl implements IPacienteRepo {

	@Override
	public String saludar(Paciente paciente) {
		// TODO Auto-generated method stub
		return paciente.getNombre();
	}

}
