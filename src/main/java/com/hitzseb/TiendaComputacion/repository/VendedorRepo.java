package com.hitzseb.TiendaComputacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hitzseb.TiendaComputacion.model.Vendedor;

@Repository
public interface VendedorRepo extends JpaRepository<Vendedor, Integer> {

}
