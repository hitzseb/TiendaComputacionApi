package com.hitzseb.TiendaComputacion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.hitzseb.TiendaComputacion.model.Sucursal;
import com.hitzseb.TiendaComputacion.service.ISucursalService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
public class SucursalController {

	@Autowired
	public ISucursalService sucursalService;

	@GetMapping("/sucursales")
	@ResponseBody
	public List<Sucursal> getSucursales() {
		return sucursalService.showSucursales();
	}

}