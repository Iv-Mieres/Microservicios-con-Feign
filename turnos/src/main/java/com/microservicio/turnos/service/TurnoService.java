package com.microservicio.turnos.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.turnos.dto.PacienteDTO;
import com.microservicio.turnos.dto.TurnoDTO;
import com.microservicio.turnos.model.Turno;
import com.microservicio.turnos.repository.ITurnoRepository;
import com.microservicio.turnos.repository.PacienteApiClient;

@Service
public class TurnoService implements ITurnoService{
	
	@Autowired
	private ITurnoRepository turnoRepository;
	@Autowired
	private PacienteApiClient pacienteClient;
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public void guardarTurno(TurnoDTO turno) {
		
		PacienteDTO paciente = pacienteClient.verPaciente(turno.getIdPaciente());
		var guardarTurno = modelMapper.map(turno, Turno.class);
		guardarTurno.setNombreCompletoPaciente(paciente.getNombre() + " " + paciente.getApellido());
		
		turnoRepository.save(guardarTurno);
	}

	@Override
	public TurnoDTO verTurno(Long id) {
		return modelMapper.map(turnoRepository.findById(id).orElse(null), TurnoDTO.class);
	}

}
