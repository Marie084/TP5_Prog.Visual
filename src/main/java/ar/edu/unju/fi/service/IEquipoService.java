package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Equipo;


public interface IEquipoService {
	public void guardar(Equipo equipo);
	public Equipo mostrar(Equipo equipo);
	public void eliminar(Equipo equipo);
	public Equipo modificar(Equipo equipo);


}
