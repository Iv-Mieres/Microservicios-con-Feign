package com.microservicio.turnos.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservicio.turnos.dto.PacienteDTO;

@FeignClient(name = "DatosPaciente", url= "http://localhost:9004/pacientes")
public interface PacienteApiClient {
	
	
	@GetMapping("/ver/{id}")
	public PacienteDTO verPaciente(@PathVariable Long id);

}
