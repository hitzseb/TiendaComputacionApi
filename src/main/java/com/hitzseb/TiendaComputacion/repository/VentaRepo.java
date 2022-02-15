package com.hitzseb.TiendaComputacion.repository;

import com.hitzseb.TiendaComputacion.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepo extends JpaRepository<Venta, Integer> {

}
