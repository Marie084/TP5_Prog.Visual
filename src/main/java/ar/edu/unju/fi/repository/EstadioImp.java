package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Olivera1820Tp5Application;
import ar.edu.unju.fi.model.Estadio;

@Repository
public class EstadioImp implements IEstadio {

	@Autowired
	private Estadio estadio;
    
	public static Logger LOG = LoggerFactory.getLogger(Olivera1820Tp5Application.class);
	
	@Override
	public void guardar() {
		
		LOG.info("Info del estadio guardada " + estadio.getNombre() +  "  direccion: " +  estadio.getDireccion() + " pertenece a la ciudad de: " + estadio.getCiudad() + " tiene la capacidad de alojar a: " + estadio.getCapacidad());
	
		
	}

	@Override
	public Estadio mostrar() {
		LOG.info("Datos del estadio: ");
		return estadio;
	}

	@Override
	public void eliminar() {
		LOG.info("Se elimino la info del estadio seleccionado");

	}

	@Override
	public Estadio modificar() {
		LOG.info("Nombre/estadio modificado");
		return estadio;
	}

}

