package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;

@Repository
public class IEquipoServiceImp implements IEquipoService  {

	@Autowired
	private IEquipo iequipo;
	
	@Override
	public void guardar(Equipo equipo) {
		iequipo.guardar(equipo);
		
	}

	@Override
	public Equipo mostrar(Equipo equipo) {
		Equipo eq = iequipo.mostrar(equipo);
		return eq;
	}

	@Override
	public void eliminar(Equipo equipo) {
		iequipo.eliminar(equipo);
		
	}

	@Override
	public Equipo modificar(Equipo equipo) {
		Equipo eq = iequipo.modificar(equipo);
		return eq;
	}
	

}
