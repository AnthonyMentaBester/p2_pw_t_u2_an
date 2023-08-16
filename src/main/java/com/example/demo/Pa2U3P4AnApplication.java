package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
//esto me permite habilitar el rpoceso asincronamente 
@EnableAsync
public class Pa2U3P4AnApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(Pa2U3P4AnApplication.class);

	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		LOG.info("HILO: " + Thread.currentThread().getName());

		// inicio
		long tiempoInicial = System.currentTimeMillis();
		List<CompletableFuture<Double>> listaRespuesta = new ArrayList<>();
		List<Estudiante> lista = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			Estudiante estu = new Estudiante();
			
			estu.setApellido("narvaez");
			estu.setCedula("1718834506");
			estu.setFacultad("computacion");
			estu.setNombre("änthiony");
			
			// fecha entre 1990-01-01 y la fecha actual
		    LocalDate fechaAleatoria = LocalDate.ofEpochDay(ThreadLocalRandom.current().nextLong(
		            LocalDate.of(1990, 1, 1).toEpochDay(), LocalDate.now().toEpochDay()));
		    estu.setFecha(fechaAleatoria);

		    LocalDate fechaActual = LocalDate.now();
		    int edad = fechaActual.getYear() - fechaAleatoria.getYear();

		    if (fechaAleatoria.getDayOfYear() > fechaActual.getDayOfYear()) {
		        edad--;
		        
		        
		    }
		    
		    
		    estu.setEdad(edad);
		    
			
			// LO QUE DEBO HACER AL METODO ASINCRONO QUE DEBO SABER UNA RESPUESTA
			// LO DEBO CAPTURAR EN UN FUTURE DE TIPO STRING
			// en un futuro debo decirle dame las respuesta de todo
			// tengo una promesa de respuesta
			CompletableFuture<Double> respuesta = this.estudianteService.promEdad(estu);
			listaRespuesta.add(respuesta);
			
			
			
		}
		// sentencia que espera termine de procesarse todos los hilos para obtener la
		// respuesta
		CompletableFuture<Void> test = CompletableFuture.allOf(listaRespuesta.get(0), listaRespuesta.get(1), listaRespuesta.get(2),
				listaRespuesta.get(3), listaRespuesta.get(4));
		test.get();

		LOG.info("Respuesta 0: " + listaRespuesta.get(0).get());
		LOG.info("Respuesta 1: " + listaRespuesta.get(1).get());
		LOG.info("Respuesta 2: " + listaRespuesta.get(2).get());
		LOG.info("Respuesta 3: " + listaRespuesta.get(3).get());
		LOG.info("Respuesta 4: " + listaRespuesta.get(4).get());
		
		List<Double> edadesObtenidas = new ArrayList<>();
		for (CompletableFuture<Double> respuesta : listaRespuesta) {
		    edadesObtenidas.add(respuesta.get());
		}

		double sumaEdades = 0;
		for (Double edad : edadesObtenidas) {
		    sumaEdades += edad;
		}

		double promedioEdades = sumaEdades / edadesObtenidas.size();
		LOG.info("Suma de edades: " + sumaEdades);
		LOG.info("Promedio de edades: " + promedioEdades);
		
		
		

		// final
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTotal = (tiempoFinal - tiempoInicial) / 1000;
		LOG.info("Tiempo transcurrido: " + (tiempoFinal - tiempoInicial));
		LOG.info("Tiempo transcurrido: " + tiempoTotal);
		LOG.info("Se termino de procesar todo todo: ");
	}

}
