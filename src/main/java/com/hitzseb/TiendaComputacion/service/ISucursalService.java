package com.hitzseb.TiendaComputacion.service;

import java.util.List;
import com.hitzseb.TiendaComputacion.model.Sucursal;

public interface ISucursalService {

	public List<Sucursal> showSucursales();
	
	public void saveSucursal(Sucursal sucursal);

	public Sucursal findSucursal(int id);

	public void deleteSucursal(int id);

}