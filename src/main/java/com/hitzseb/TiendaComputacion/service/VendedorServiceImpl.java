package com.hitzseb.TiendaComputacion.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hitzseb.TiendaComputacion.model.Vendedor;
import com.hitzseb.TiendaComputacion.repository.VendedorRepo;

@Service
public class VendedorServiceImpl implements IVendedorService {

	@Autowired
	public VendedorRepo vendedorRepo;

	@Override
	public List<Vendedor> showVendedores() {
		return vendedorRepo.findAll();
	}

	@Override
	public void saveVendedor(Vendedor vendedor) {
		vendedorRepo.save(vendedor);
	}

	@Override
	public Vendedor findVendedor(int id) {
		return vendedorRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteVendedor(int id) {
		vendedorRepo.deleteById(id);
	}

}