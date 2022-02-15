package com.hitzseb.TiendaComputacion.service;

import java.util.List;
import com.hitzseb.TiendaComputacion.model.Vendedor;

public interface IVendedorService {

	public List<Vendedor> showVendedores();
	
	public void saveVendedor(Vendedor vendedor);

	public Vendedor findVendedor(int id);

	public void deleteVendedor(int id);

}