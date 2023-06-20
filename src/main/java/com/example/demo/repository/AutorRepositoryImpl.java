package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepositoryImpl implements AutorRepository{
	@PersistenceContext
	private EntityManager entitymanager;

    @Override
    public void insertar(Autor autor) {
        // TODO Auto-generated method stub
        this.entitymanager.persist(autor);
    }

    @Override
    public void actualizar(Autor autor) {
        // TODO Auto-generated method stub
        this.entitymanager.merge(autor);
    }

    @Override
    public Autor seleccionar(Integer id) {
        // TODO Auto-generated method stub
        return this.entitymanager.find(Autor.class,id);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
    	Autor autor = this.seleccionar(id);
        this.entitymanager.remove(autor);
    }


}
