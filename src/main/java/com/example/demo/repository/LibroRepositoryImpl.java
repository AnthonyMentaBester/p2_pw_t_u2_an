package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepositoryImpl implements LibroRepository{
	 @PersistenceContext
		private EntityManager entitymanager;

	    @Override
	    public void insertar(Libro libro) {
	        // TODO Auto-generated method stub
	        this.entitymanager.persist(libro);
	    }

	    @Override
	    public void actualizar(Libro libro) {
	        // TODO Auto-generated method stub
	        this.entitymanager.merge(libro);
	    }

	    @Override
	    public Libro seleccionar(Integer id) {
	        // TODO Auto-generated method stub
	        return this.entitymanager.find(Libro.class,id);
	    }

	    @Override
	    public void eliminar(Integer id) {
	        // TODO Auto-generated method stub
	    	Libro libro = this.seleccionar(id);
	        this.entitymanager.remove(libro);
	    }

}
