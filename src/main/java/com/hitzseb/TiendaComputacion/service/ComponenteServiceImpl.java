package com.hitzseb.TiendaComputacion.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hitzseb.TiendaComputacion.model.Componente;
import com.hitzseb.TiendaComputacion.repository.ComponenteRepo;

@Service
public class ComponenteServiceImpl implements IComponenteService {

	@Autowired
	public ComponenteRepo componenteRepo;

	@Override
	public List<Componente> showComponentes() {
		return componenteRepo.findAll();
	}

	@Override
	public void saveComponente(Componente componente) {
		componenteRepo.save(componente);
	}

	@Override
	public Componente findComponente(int id) {
		return componenteRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteComponente(int id) {
		componenteRepo.deleteById(id);
	}

}