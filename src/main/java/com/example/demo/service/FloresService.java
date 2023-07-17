package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Flores;

public interface FloresService {
	public void agregar(Flores flores);
	public void actualizar(Flores flores);
	public Flores buscar(Integer id);
	public void borrar(Integer id);
	
	public List<Flores> buscarInnerJoin();
	public List<Flores> buscarInnerJoin1();
	//RIGHT
	public List<Flores> buscarOuterRightJoin();
	public List<Flores> buscarOuterRightJoin1();
	//LEFT
	public List<Flores> buscarOuterLeftJoin();
	public List<Flores> buscarOuterLeftJoin1();
	//FULL
	public List<Flores> buscarOuterFullJoin();
	public List<Flores> buscarOuterFullJoin1();
	//WHERE
	public List<Flores> buscarWhereJoin();
	public List<Flores> buscarWhereJoin1();
	//FETCH
		public List<Flores> buscarFetchJoin();
		public List<Flores> buscarFetchJoin1();

}
