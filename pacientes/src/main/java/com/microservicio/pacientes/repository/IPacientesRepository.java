package com.microservicio.pacientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.pacientes.model.Paciente;

@Repository
public interface IPacientesRepository extends JpaRepository<Paciente,Long>{

}
