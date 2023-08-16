package com.example.demo.service;

import java.util.concurrent.CompletableFuture;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void agregar(Estudiante estudiante);
	public Estudiante buscar(String cedula);
	public CompletableFuture<Double> promEdad(Estudiante estudiante);

}
