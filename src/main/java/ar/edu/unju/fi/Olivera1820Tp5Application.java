package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IEstadioService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IResultadoService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Olivera1820Tp5Application implements CommandLineRunner {

	@Autowired
	IUsuarioService usuarioService;
	
	@Autowired
	ICuotaService cuotaService;
	
	@Autowired
	IEquipoService equipoService;
	
	@Autowired
	IEstadioService estadioService;
	@Autowired
	INoticiaService noticiaService;
	@Autowired
	IResultadoService resultadoService;

	@Autowired
	Usuario usuario;
	@Autowired
	Cuota cuota;
	// no lleva Autowired para que se muestre mas que un solo nombre de equipo.
	Equipo equipo1;
	Equipo equipo2;
	
	@Autowired	
	Estadio estadio;
	@Autowired
	Noticia noticia;
	@Autowired
	Resultado resultado;

	public static void main(String[] args) {
		SpringApplication.run(Olivera1820Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		usuario.setApellido("Perez");
		usuario.setDireccion("Av Mazorca 331");
		usuario.setDni(11234567);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1987, 8, 7));
		usuario.setId(1L);
		usuario.setNombre("Apolinario");
		usuario.setPassword("234");
		usuario.setTipo("SOCIO");

		usuarioService.guardar();

		cuota.setMonto(200);
		cuota.setEstado("adeuda");
		cuotaService.guardar();
		
		equipo1 = new Equipo();
		equipo2 = new Equipo();
		equipo1.setNombre("El ballenita");
		equipo2.setNombre("Boca");
		
		equipoService.guardar(equipo1);
		equipoService.guardar(equipo2);
		
		estadio.setCapacidad(1000);
		estadio.setCiudad("QUITO");
		estadio.setDireccion("Siempreviva 2020");
		estadio.setNombre("Maracana");
		estadioService.guardar();
		
		noticia.setFecha(LocalDate.of(2020, 2, 15));
		noticia.setTitulo("El estadio se colmo de simpatizantes del Ballenita");
		noticiaService.guardar();
		
		resultado.setEquipo1(equipo1);
		resultado.setEquipo2(equipo2);
		resultado.setFecha(LocalDate.of(2020, 1, 5));
		resultado.setGolesEquipo1(3);
		resultado.setGolesEquipo2(1);
		
		resultadoService.guardar();
		
		
	}

}
