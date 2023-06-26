package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "zapato")
@Entity
public class Zapato {

	@GeneratedValue(generator = "seq_zapato", strategy = GenerationType.SEQUENCE ) 
	@SequenceGenerator(name = "seq_zapato", sequenceName = "seq_zapato", allocationSize = 1)
	@Id
	@Column(name = "zap_id")
	private Integer id;
	
	@Column(name = "zap_marca")
	private String marca;

	@Column(name = "zap_precio")
	private BigDecimal precio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Zapato [id=" + id + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	
	

}
