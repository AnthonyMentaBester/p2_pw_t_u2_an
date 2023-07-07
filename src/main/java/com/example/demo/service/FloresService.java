package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Flores;

public interface FloresService {
	public void agregar(Flores flores);
	public void actualizar(Flores flores);
	public Flores buscar(Integer id);
	public void borrar(Integer id);
	
	//Criteria 
	public List<Flores> seleccionarFloresDinamicoCriteriaQuery(String nombre);
	
	//actualizar y borrar
	public int borrarPorNombre(String nombre);
	public int actualizarPorEstado(String estado);

}
