package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Zapato;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ZapatoRepositoryImp implements ZapatoRepository{

	@PersistenceContext
	private EntityManager entitymanager;
	
	@Override
	public void insertar(Zapato zapato) {
		// TODO Auto-generated method stub
		this.entitymanager.persist(zapato);
		
	}

	@Override
	public void actualizar(Zapato zapato) {
		// TODO Auto-generated method stub
		this.entitymanager.merge(zapato);
	}

	@Override
	public Zapato seleccionar(String marca) {
		// TODO Auto-generated method stub
		return this.entitymanager.find(Zapato.class, marca);
	}

	@Override
	public void eliminar(String marca) {
		// TODO Auto-generated method stub
		Zapato zap = this.seleccionar(marca);
		this.entitymanager.remove(zap);
		
	}

	@Override
	public Zapato seleccionarPorMarca(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entitymanager.createQuery("SELECT e FROM Zapato e WHERE e.marca = :datoMarca");
		myQuery.setParameter("datoMarca", marca);
		return (Zapato) myQuery.getSingleResult();
		
	}

	@Override
	public List<Zapato> seleccionarListaPorListaMarca(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entitymanager.createQuery("SELECT e FROM Zapato e WHERE e.marca = :datoMarca");
		myQuery.setParameter("datoMarca", marca);
		return myQuery.getResultList();
	}

	@Override
	public Zapato seleccionarPorPrecioTyped(BigDecimal precio) {
		// TODO Auto-generated method stub
		TypedQuery myQuery = this.entitymanager.createQuery("SELECT e FROM Zapato e WHERE e.precio = :datoPrecio", Zapato.class);
		myQuery.setParameter("datoPrecio", precio);
		return (Zapato) myQuery.getSingleResult();
		
	}

	@Override
	public List<Zapato> seleccionarListaPorPrecioTyped(BigDecimal precio) {
		// TODO Auto-generated method stub
		TypedQuery<Zapato> myQuery = this.entitymanager.createQuery("SELECT e FROM Zapato e WHERE e.precio = :datoPrecio", Zapato.class);
		myQuery.setParameter("datoPrecio", precio);
		return myQuery.getResultList();
	}

}
