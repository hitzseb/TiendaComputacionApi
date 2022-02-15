package com.hitzseb.TiendaComputacion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.hitzseb.TiendaComputacion.model.Componente;
import com.hitzseb.TiendaComputacion.service.IComponenteService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
public class ComponenteController {
	
	@Autowired
	public IComponenteService componenteService;
	
	@GetMapping("/componentes")
	@ResponseBody
	public List<Componente> showComponentes() {
		return componenteService.showComponentes();
	}
	
}