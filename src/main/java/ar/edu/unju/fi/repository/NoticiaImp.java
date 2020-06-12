package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Olivera1820Tp5Application;
import ar.edu.unju.fi.model.Noticia;

@Repository
public class NoticiaImp implements INoticia {

	@Autowired
	private Noticia noticia;
    
	public static Logger LOG = LoggerFactory.getLogger(Olivera1820Tp5Application.class);
	
	@Override
	public void guardar() {
		
		LOG.info("En la fecha : " + noticia.getFecha() + noticia.getTitulo());
	}

	@Override
	public Noticia mostrar() {
		LOG.info("Info: " + noticia.getResumen());
		return noticia;
	}

	@Override
	public void eliminar() {
		LOG.info("Se eliminó la informacion");

	}

	@Override
	public Noticia modificar() {
		LOG.info("Informacion modificada");
		return noticia;
	}

}