package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Flores;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FloresRepositoryImpl implements FloresRepository {

	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public void insertar(Flores flores) {
		// TODO Auto-generated method stub
		this.entitymanager.persist(flores);
	}

	@Override
	public void actualizar(Flores flores) {
		// TODO Auto-generated method stub
		this.entitymanager.merge(flores);
	}

	@Override
	public Flores seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entitymanager.find(Flores.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Flores flr = this.seleccionar(id);
		this.entitymanager.remove(flr);
	}


	@Override
	public List<Flores> seleccionarInnerJoin() {
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f INNER JOIN f.arreglos a ",Flores.class);
		
		return myQuery.getResultList();
			}

	@Override
	public List<Flores> seleccionarInnerJoin1() {
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f INNER JOIN f.arreglos a WHERE f.color = :color",Flores.class);
		myQuery.setParameter("color", "verde");
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionerOuterRightJoin() {
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f RIGHT JOIN f.arreglos a",Flores.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionerOuterRightJoin1() {
		
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f RIGHT JOIN f.arreglos a WHERE f.estado = :estado",Flores.class);
		myQuery.setParameter("estado", "marchitas");
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionerOuterLeftJoin() {
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f LEFT JOIN f.arreglos a WHERE f.nombre = :nombre",Flores.class);
		myQuery.setParameter("nombre", "acasias");
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionerOuterLeftJoin1() {
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f LEFT JOIN f.arreglos a WHERE f.tipo = :tipo",Flores.class);
		myQuery.setParameter("tipo", "angiospermas");
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionerOuterFullJoin() {
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f FULL JOIN f.arreglos a",Flores.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionerOuterFullJoin1() {
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f FULL JOIN f.arreglos WHERE f.costo = :costo",Flores.class);
		myQuery.setParameter("costo", 10);
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionarWhereJoin() {
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f, Arreglos a WHERE f = a.flores",Flores.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionarWhereJoin1() {
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f, Arreglos a WHERE f = a.flores ",Flores.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionarFetchJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f JOIN FETCH f.arreglos a",Flores.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Flores> seleccionarFetchJoin1() {
		// TODO Auto-generated method stub
		TypedQuery<Flores> myQuery = this.entitymanager.createQuery("SELECT f FROM Flores f JOIN FETCH f.arreglos a",Flores.class);
		
		return myQuery.getResultList();
	}

}
