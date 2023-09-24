package com.microservicio.pacientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.pacientes.dto.PacienteDTO;
import com.microservicio.pacientes.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService pacienteService;
	
	
	@PostMapping("/crear")
	public ResponseEntity<HttpStatus> guardarPaciente(@RequestBody PacienteDTO paciente){
		pacienteService.guardarPaciente(paciente);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	@GetMapping("/ver/{id}")
	public ResponseEntity<PacienteDTO> VERPaciente(@PathVariable long id){
		return ResponseEntity.status(HttpStatus.OK).body(pacienteService.verPacientePorId(id));
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<HttpStatus> guardarPaciente(@PathVariable Long id){
		pacienteService.eliminarPaciente(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	
	
	
	
	
	

}
