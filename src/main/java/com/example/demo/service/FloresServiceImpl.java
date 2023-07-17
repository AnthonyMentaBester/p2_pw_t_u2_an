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
	public List<Flores> buscarInnerJoin() {
		
		return this.floresRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Flores> buscarInnerJoin1() {
		return this.floresRepository.seleccionarInnerJoin1();
	}

	@Override
	public List<Flores> buscarOuterRightJoin() {

		return this.floresRepository.seleccionerOuterRightJoin();
	}

	@Override
	public List<Flores> buscarOuterRightJoin1() {
		return this.floresRepository.seleccionerOuterRightJoin1();
	}

	@Override
	public List<Flores> buscarOuterLeftJoin() {
		
		return this.floresRepository.seleccionerOuterLeftJoin();
	}

	@Override
	public List<Flores> buscarOuterLeftJoin1() {
		return this.floresRepository.seleccionerOuterLeftJoin1();
	}

	@Override
	public List<Flores> buscarOuterFullJoin() {
	
		return this.floresRepository.seleccionerOuterFullJoin();
	}

	@Override
	public List<Flores> buscarOuterFullJoin1() {
		return this.floresRepository.seleccionerOuterFullJoin1();
	}

	@Override
	public List<Flores> buscarWhereJoin() {
	
		return this.floresRepository.seleccionarWhereJoin();
	}

	@Override
	public List<Flores> buscarWhereJoin1() {
	
		return this.floresRepository.seleccionarWhereJoin1();
	}

	@Override
	public List<Flores> buscarFetchJoin() {
		// TODO Auto-generated method stub
		return this.floresRepository.seleccionarFetchJoin();
	}

	@Override
	public List<Flores> buscarFetchJoin1() {
		// TODO Auto-generated method stub
		return this.floresRepository.seleccionarFetchJoin1();
	}

}
