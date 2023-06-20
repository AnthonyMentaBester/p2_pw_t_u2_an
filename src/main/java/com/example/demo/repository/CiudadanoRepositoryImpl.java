package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepositoryImpl implements CiudadanoRepository {

    @PersistenceContext
	private EntityManager entitymanager;

    @Override
    public void insertar(Ciudadano ciudadano) {
        // TODO Auto-generated method stub
        this.entitymanager.persist(ciudadano);
    }

    @Override
    public void actualizar(Ciudadano ciudadano) {
        // TODO Auto-generated method stub
        this.entitymanager.merge(ciudadano);
    }

    @Override
    public Ciudadano seleccionar(Integer id) {
        // TODO Auto-generated method stub
        return this.entitymanager.find(Ciudadano.class,id);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        Ciudadano ciudadano = this.seleccionar(id);
        this.entitymanager.remove(ciudadano);
    }

    
}
