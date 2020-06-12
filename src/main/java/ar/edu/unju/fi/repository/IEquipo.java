package ar.edu.unju.fi.repository;


import ar.edu.unju.fi.model.Equipo;

public interface IEquipo {

	public void guardar(Equipo equipo); //El nombre del equipo se envia por parametro para que muestre 
	                                    //mas de un nombre de equipo distinto.
	public Equipo mostrar(Equipo equipo);
	public void eliminar(Equipo equipo);
	public Equipo modificar(Equipo equipo);

}
