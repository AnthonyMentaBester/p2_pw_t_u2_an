package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Flores;

public interface FloresRepository {
	
	public void insertar(Flores flores);
	public void actualizar(Flores flores);
	public Flores seleccionar(Integer id);
	public void eliminar(Integer id);
	
	public List<Flores> seleccionarInnerJoin();
	public List<Flores> seleccionarInnerJoin1();
	//RIGHT
	public List<Flores> seleccionerOuterRightJoin();
	public List<Flores> seleccionerOuterRightJoin1();
	//LEFT
	public List<Flores> seleccionerOuterLeftJoin();
	public List<Flores> seleccionerOuterLeftJoin1();
	//FULL
	public List<Flores> seleccionerOuterFullJoin();
	public List<Flores> seleccionerOuterFullJoin1();
	//WHERE
	public List<Flores> seleccionarWhereJoin();
	public List<Flores> seleccionarWhereJoin1();
	//FETCH
	public List<Flores> seleccionarFetchJoin();
	public List<Flores> seleccionarFetchJoin1();


}
