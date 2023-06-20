package com.example.demo.service;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionService {
    public void agregar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion buscar(Integer id);
	public void borrar(Integer id); 
    
}
