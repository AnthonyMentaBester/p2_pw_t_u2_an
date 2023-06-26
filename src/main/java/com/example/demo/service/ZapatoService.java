package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Zapato;

public interface ZapatoService {
	public void agregar(Zapato zapato);
	public void actualizar(Zapato zapato);
	public Zapato buscar(String marca);
	public void borrar(String marca);
	
	//query
	public Zapato buscarPorMarca(String marca);
	public List<Zapato> buscarListaPorListaMarca(String marca);

	
	//typed query
	public Zapato buscarPorPrecioTyped(BigDecimal precio);
	public List<Zapato> buscarListaPorPrecioTyped(BigDecimal precio);

}
