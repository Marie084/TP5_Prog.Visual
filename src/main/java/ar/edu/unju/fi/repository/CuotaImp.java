package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Olivera1820Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository
public class CuotaImp implements ICuota {
	@Autowired
	private Cuota cuota;
    
	public static Logger LOG = LoggerFactory.getLogger(Olivera1820Tp5Application.class);
	
	@Override
	public void guardar() {
		
		LOG.info("El importe de la cuota es: " + cuota.getMonto() +  " el estado de la misma es: " +  cuota.getEstado());
		
	}

	@Override
	public Cuota mostrar() {
		LOG.info("Datos de pago del usuario: ");
		return cuota;
	}

	@Override
	public void eliminar() {
		LOG.info("Se elimino el importe de la cuota");

	}

	@Override
	public Cuota modificar() {
		LOG.info("Importe/cuota modificado");
		return cuota;
	}

}
