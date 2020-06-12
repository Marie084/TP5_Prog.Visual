package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Cuota;


public interface ICuotaService {
	void guardar();
	Cuota mostrar();
	void eliminar();
	Cuota modificar();


}
