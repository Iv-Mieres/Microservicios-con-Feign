package com.microservicio.pacientes.service;

import com.microservicio.pacientes.dto.PacienteDTO;

public interface IPacienteService {

	void guardarPaciente(PacienteDTO paciente);
	PacienteDTO verPacientePorId(Long id);
	void actualizarPaciente(PacienteDTO paciente);
	void eliminarPaciente(Long id);
	
}
