package com.example.demo.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;


@Service
public class EstudianteServiceImpl implements EstudianteService{
	
	private static final Logger LOG = LoggerFactory.getLogger(EstudianteServiceImpl.class);

	
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public void agregar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		
		
		return this.estudianteRepository.seleccionar(cedula);
	}

	@Override 
	
	@Async
	public CompletableFuture<Double> promEdad(Estudiante estudiante) {
		LOG.info("HILO: " + Thread.currentThread().getName());
	
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.estudianteRepository.insertar(estudiante);
		//debo apoyarme tambien en retorno
		Integer edadOrigen = estudiante.getEdad();
		Integer edadProm = edadOrigen + estudiante.getEdad();
		Double edadFinal = (double) (edadProm);
		
		return CompletableFuture.completedFuture(edadFinal);
	}

}
