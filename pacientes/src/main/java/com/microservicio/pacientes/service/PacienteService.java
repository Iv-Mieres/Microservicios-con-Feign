package com.microservicio.pacientes.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.pacientes.dto.PacienteDTO;
import com.microservicio.pacientes.model.Paciente;
import com.microservicio.pacientes.repository.IPacientesRepository;

@Service
public class PacienteService implements IPacienteService{
	
	@Autowired
	private IPacientesRepository pacientesRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public void guardarPaciente(PacienteDTO paciente) {
		pacientesRepository.save(modelMapper.map(paciente, Paciente.class));
	}

	@Override
	public PacienteDTO verPacientePorId(Long id) {
		return modelMapper.map(pacientesRepository.findById(id).orElse(null), PacienteDTO.class);
	}

	@Override
	public void actualizarPaciente(PacienteDTO paciente) {
		
	}

	@Override
	public void eliminarPaciente(Long id) {
		pacientesRepository.deleteById(id);
	}

}
