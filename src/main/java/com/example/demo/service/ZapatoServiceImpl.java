package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ZapatoRepository;
import com.example.demo.repository.modelo.Zapato;

@Service
public class ZapatoServiceImpl implements ZapatoService {

	@Autowired
	private ZapatoRepository zapatoRepository;
	
	@Override
	public void agregar(Zapato zapato) {
		// TODO Auto-generated method stub
		this.zapatoRepository.insertar(zapato);
	}

	@Override
	public void actualizar(Zapato zapato) {
		// TODO Auto-generated method stub
		this.zapatoRepository.actualizar(zapato);
	}

	@Override
	public Zapato buscar(String marca) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionar(marca);
	}

	@Override
	public void borrar(String marca) {
		// TODO Auto-generated method stub
		this.zapatoRepository.eliminar(marca);
	}

	@Override
	public Zapato buscarPorMarca(String marca) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionarPorMarca(marca);
	}

	@Override
	public List<Zapato> buscarListaPorListaMarca(String marca) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionarListaPorListaMarca(marca);
	}

	@Override
	public Zapato buscarPorPrecioTyped(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionarPorPrecioTyped(precio);
	}

	@Override
	public List<Zapato> buscarListaPorPrecioTyped(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.zapatoRepository.seleccionarListaPorPrecioTyped(precio);
	}

}
