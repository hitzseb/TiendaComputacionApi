package com.hitzseb.TiendaComputacion.service;

import java.util.List;
import com.hitzseb.TiendaComputacion.model.Componente;

public interface IComponenteService {

	public List<Componente> showComponentes();
	
	public void saveComponente(Componente componente);

	public Componente findComponente(int id);

	public void deleteComponente(int id);

}