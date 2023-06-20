package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepositoryImpl implements HabitacionRepository {

    @PersistenceContext
	private EntityManager entitymanager;

    @Override
    public void insertar(Habitacion habitacion) {
        // TODO Auto-generated method stub
        this.entitymanager.persist(habitacion);
    }

    @Override
    public void actualizar(Habitacion habitacion) {
        // TODO Auto-generated method stub
        this.entitymanager.merge(habitacion);
    }

    @Override
    public Habitacion seleccionar(Integer id) {
        // TODO Auto-generated method stub
        return this.entitymanager.find(Habitacion.class,id);
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        Habitacion habitacion = this.seleccionar(id);
        this.entitymanager.remove(habitacion);
    }

    
}