package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Flores;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FloresRepositoryImpl implements FloresRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Flores flores) {
		// TODO Auto-generated method stub
		this.entityManager.persist(flores);
	}

	@Override
	public void actualizar(Flores flores) {
		// TODO Auto-generated method stub
		this.entityManager.merge(flores);
	}

	@Override
	public Flores seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Flores.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Flores flr = this.seleccionar(id);
		this.entityManager.remove(flr);
	}

	@Override
	public List<Flores> seleccionarFloresDinamicoCriteriaQuery(String nombre) {

		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Flores> myCriteriaQuery = myBuilder.createQuery(Flores.class);
		Root<Flores> myTablaFrom = myCriteriaQuery.from(Flores.class);

		myCriteriaQuery.select(myTablaFrom);

		// Definir los predicados
		List<Predicate> predicados = new ArrayList<>();

		// Filtrar por nombre que empieza con "a"
		if (nombre != null && nombre.startsWith("a")) {
			predicados.add(myBuilder.equal(myBuilder.substring(myTablaFrom.get("nombre"), 1, 1), "a"));
		}

		// Filtrar por color rojo
		predicados.add(myBuilder.equal(myTablaFrom.get("color"), "rojo"));

		// Filtrar por estado "bien"
		predicados.add(myBuilder.equal(myTablaFrom.get("estado"), "bien"));

		// Filtrar por petalos superiores a 5
		predicados.add(myBuilder.greaterThan(myTablaFrom.get("petalos"), 5.0));

		// Combinar los predicados con una conjunción "AND"
		myCriteriaQuery.where(myBuilder.and(predicados.toArray(new Predicate[0])));

		TypedQuery<Flores> query = entityManager.createQuery(myCriteriaQuery);
		return query.getResultList();

	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Flores> query = entityManager.createQuery("DELETE FROM Flores f WHERE f.nombre = :nombre AND f.color = :color AND f.estado = :estado", Flores.class);
	    query.setParameter("nombre", nombre);
	    query.setParameter("color", "verde");
	    query.setParameter("estado", "marchitas");
	    return query.executeUpdate();
	}

	@Override
	public int actualizarPorEstado(String estado) {
		// TODO Auto-generated method stub
		TypedQuery<Flores> query = entityManager.createQuery("UPDATE Flores f SET f.cantidad = f.cantidad * 2 WHERE f.estado = :estado", Flores.class);
	    query.setParameter("estado", estado);
	    

	    return query.executeUpdate();
	}

}
