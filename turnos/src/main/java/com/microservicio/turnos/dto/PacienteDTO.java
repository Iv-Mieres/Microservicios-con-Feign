package com.microservicio.turnos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteDTO {
	
	private Long id;
	private String nombre;
	private String apellido;	

}
