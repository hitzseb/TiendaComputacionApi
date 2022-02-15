package com.hitzseb.TiendaComputacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hitzseb.TiendaComputacion.model.Sucursal;

@Repository
public interface SucursalRepo extends JpaRepository<Sucursal, Integer> {

}
