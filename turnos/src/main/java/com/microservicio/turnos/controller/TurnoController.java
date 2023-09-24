package com.microservicio.turnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.turnos.dto.TurnoDTO;
import com.microservicio.turnos.service.ITurnoService;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

	
	@Autowired
	private ITurnoService turnoService;
	
	
	@PostMapping()
	public ResponseEntity<HttpStatus> guardarTurno(@RequestBody TurnoDTO turno){
		turnoService.guardarTurno(turno);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping()
	public ResponseEntity<TurnoDTO> verTurno(@PathVariable Long id){
		return ResponseEntity.ok(turnoService.verTurno(id));
	}
	
	
	
}
