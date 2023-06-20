package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.modelo.Autor;
@Service
public class AutorServiceImpl implements AutorService{
	
	@Autowired
    private AutorRepository autorRepository;

    @Override
    public void agregar(Autor autor) {
        // TODO Auto-generated method stub
        this.autorRepository.insertar(autor);
    }

    @Override
    public void actualizar(Autor autor) {
        // TODO Auto-generated method stub
        this.autorRepository.actualizar(autor);
    }

    @Override
    public Autor buscar(Integer id) {
        // TODO Auto-generated method stub
        return this.autorRepository.seleccionar(id);
    }

    @Override
    public void borrar(Integer id) {
        // TODO Auto-generated method stub
        this.autorRepository.eliminar(id);
    }

}
