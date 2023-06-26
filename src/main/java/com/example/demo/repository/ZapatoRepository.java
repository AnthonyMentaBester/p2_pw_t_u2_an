package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Zapato;

public interface ZapatoRepository {
	public void insertar(Zapato zapato);
	public void actualizar(Zapato zapato);
	public Zapato seleccionar(String marca);
	public void eliminar(String marca);
	
	//query
	public Zapato seleccionarPorMarca(String marca);
	public List<Zapato> seleccionarListaPorListaMarca(String marca);

	
	//typed
	public Zapato seleccionarPorPrecioTyped(BigDecimal precio);
	public List<Zapato> seleccionarListaPorPrecioTyped(BigDecimal precio);
	

}
