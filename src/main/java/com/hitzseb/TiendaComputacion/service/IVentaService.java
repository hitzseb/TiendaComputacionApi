package com.hitzseb.TiendaComputacion.service;

import java.util.List;

import com.hitzseb.TiendaComputacion.model.Venta;

public interface IVentaService {

	public List<Venta> showVentas();

	public void saveVenta(Venta venta);

	public Venta findVenta(int id);

	public void deleteVenta(int id);

}