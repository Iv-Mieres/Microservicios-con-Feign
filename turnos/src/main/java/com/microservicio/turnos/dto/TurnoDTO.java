package com.microservicio.turnos.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurnoDTO {
	
	private Long id;
	private String tratamiento;
	private String nombreCompletoPaciente;
	private LocalDate fecha;
	private Long idPaciente;

}
