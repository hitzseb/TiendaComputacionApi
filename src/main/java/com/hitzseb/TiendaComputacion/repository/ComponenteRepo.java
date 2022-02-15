package com.hitzseb.TiendaComputacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hitzseb.TiendaComputacion.model.Componente;

@Repository
public interface ComponenteRepo extends JpaRepository<Componente, Integer> {

}
