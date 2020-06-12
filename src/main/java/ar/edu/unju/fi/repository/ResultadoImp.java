package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Olivera1820Tp5Application;
import ar.edu.unju.fi.model.Resultado;

@Repository
public class ResultadoImp implements IResultado {

	@Autowired
	private Resultado resultado;

	public static Logger LOG = LoggerFactory.getLogger(Olivera1820Tp5Application.class);

	@Override
	public void guardar() {

		LOG.info("El resultado del partido jugado el:  " + resultado.getFecha() + " entre  "
				+ resultado.getEquipo1().getNombre() + " y " + resultado.getEquipo2().getNombre() + " fue: "
				+ resultado.getGolesEquipo1() + " a " + resultado.getGolesEquipo2());

	}

	@Override
	public Resultado mostrar() {
		LOG.info("Resultado del partido: ");
		return resultado;
	}

	@Override
	public void eliminar() {
		LOG.info("Se elimino el resultado");

	}

	@Override
	public Resultado modificar() {
		LOG.info("Importe/cuota modificado");
		return resultado;
	}

}