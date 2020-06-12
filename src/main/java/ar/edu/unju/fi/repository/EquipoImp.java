package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Olivera1820Tp5Application;
import ar.edu.unju.fi.model.Equipo;

@Repository
public class EquipoImp implements IEquipo {
    
	public static Logger LOG = LoggerFactory.getLogger(Olivera1820Tp5Application.class);
	
	@Override
	public void guardar(Equipo equipo) {
		
		LOG.info("El nombre del equipo es: " + equipo.getNombre() );
		
	}

	@Override
	public Equipo mostrar(Equipo equipo) {
		LOG.info("Datos de pago del equipo: ");
		return equipo;
	}

	@Override
	public void eliminar(Equipo equipo) {
		LOG.info("Se elimino al equipo");

	}

	@Override
	public Equipo modificar(Equipo equipo) {
		LOG.info("Nombre/equipo modificado");
		return equipo;
	}

}

