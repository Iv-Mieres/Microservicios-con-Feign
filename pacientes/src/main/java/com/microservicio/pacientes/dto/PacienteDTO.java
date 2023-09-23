package com.microservicio.pacientes.dto;

import java.time.LocalDate;

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
	private String dni;
	private String telefono;
	private LocalDate fechaNac;
	
}
