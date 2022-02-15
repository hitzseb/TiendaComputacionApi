package com.hitzseb.TiendaComputacion.service;

import java.util.List;

import com.hitzseb.TiendaComputacion.model.Venta;
import com.hitzseb.TiendaComputacion.repository.VentaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl implements IVentaService {
	
	@Autowired
	public VentaRepo ventaRepo;

	@Override
	public List<Venta> showVentas() {
		return ventaRepo.findAll();
	}

	@Override
	public void saveVenta(Venta venta) {
		ventaRepo.save(venta);
	}

	@Override
	public Venta findVenta(int id) {
		return ventaRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteVenta(int id) {
		ventaRepo.deleteById(id);
	}

}
