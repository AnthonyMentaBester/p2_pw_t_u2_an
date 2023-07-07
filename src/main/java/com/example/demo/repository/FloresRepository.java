package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Flores;

public interface FloresRepository {
	
	public void insertar(Flores flores);
	public void actualizar(Flores flores);
	public Flores seleccionar(Integer id);
	public void eliminar(Integer id);
	
	//Criteria 
	public List<Flores> seleccionarFloresDinamicoCriteriaQuery(String nombre);
	//Actulizar y borrar
	public int eliminarPorNombre(String nombre);
	public int actualizarPorEstado(String estado);
	

}
