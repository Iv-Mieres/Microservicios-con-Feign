package com.microservicio.turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.turnos.model.Turno;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long>{

}
