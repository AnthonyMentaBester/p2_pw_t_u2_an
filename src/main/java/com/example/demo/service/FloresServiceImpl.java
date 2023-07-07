package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.FloresRepository;
import com.example.demo.repository.modelo.Flores;

@Service
public class FloresServiceImpl implements FloresService{
	
	@Autowired
	private FloresRepository floresRepository;

	@Override
	public void agregar(Flores flores) {
		// TODO Auto-generated method stub
		this.floresRepository.insertar(flores);
	}

	@Override
	public void actualizar(Flores flores) {
		// TODO Auto-generated method stub
		this.floresRepository.actualizar(flores);
	}

	@Override
	public Flores buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.floresRepository.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.floresRepository.eliminar(id);
	}

	@Override
	public List<Flores> seleccionarFloresDinamicoCriteriaQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.floresRepository.seleccionarFloresDinamicoCriteriaQuery(nombre);
	}

	@Override
	public int borrarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.floresRepository.eliminarPorNombre(nombre);
	}

	@Override
	public int actualizarPorEstado(String estado) {
		// TODO Auto-generated method stub
		return this.floresRepository.actualizarPorEstado(estado);
	}

}
