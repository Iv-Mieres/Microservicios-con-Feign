package com.microservicio.turnos.service;

import com.microservicio.turnos.dto.TurnoDTO;

public interface ITurnoService {
	
	void guardarTurno(TurnoDTO turno);
	TurnoDTO verTurno(Long id);

}
