package com.hitzseb.TiendaComputacion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.hitzseb.TiendaComputacion.model.Vendedor;
import com.hitzseb.TiendaComputacion.service.IVendedorService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
public class VendedorController {
	
	@Autowired
	public IVendedorService vendedorService;
	
	@GetMapping("/vendedores")
	@ResponseBody
	public List<Vendedor> getVendedores() {
		return vendedorService.showVendedores();
	}
	
}
