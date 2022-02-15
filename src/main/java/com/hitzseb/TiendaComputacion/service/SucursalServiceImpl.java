package com.hitzseb.TiendaComputacion.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hitzseb.TiendaComputacion.model.Sucursal;
import com.hitzseb.TiendaComputacion.repository.SucursalRepo;

@Service
public class SucursalServiceImpl implements ISucursalService {

	@Autowired
	public SucursalRepo sucursalRepo;

	@Override
	public List<Sucursal> showSucursales() {
		return sucursalRepo.findAll();
	}

	@Override
	public void saveSucursal(Sucursal sucursal) {
		sucursalRepo.save(sucursal);
	}

	@Override
	public Sucursal findSucursal(int id) {
		return sucursalRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteSucursal(int id) {
		sucursalRepo.deleteById(id);
	}

}