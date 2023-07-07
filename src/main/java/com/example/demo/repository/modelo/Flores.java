package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "flores")
public class Flores {
	
	@GeneratedValue(generator = "seq_flores", strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_flores", sequenceName = "seq_flores", allocationSize = 1)
	@Id
	@Column(name = "flr_id")
	private Integer id;
	@Column(name = "flr_nombre")
	private String nombre;
	@Column(name = "flr_tipo")
	private String tipo;
	@Column(name = "flr_color")
	private String color;
	@Column(name = "flr_fecha_ingreso")
	private LocalDate fechaIngreso;
	@Column(name = "flr_fecha_salida")
	private LocalDate fechaSalida;
	@Column(name = "flr_estado")
	private String estado;
	@Column(name = "flr_petalos")
	private Double petalos;
	@Column(name = "flr_cantidad")
	private BigDecimal cantidad;
	@Column(name = "flr_costo")
	private BigDecimal costo;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Double getPetalos() {
		return petalos;
	}
	public void setPetalos(Double petalos) {
		this.petalos = petalos;
	}
	public BigDecimal getCantidad() {
		return cantidad;
	}
	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getCosto() {
		return costo;
	}
	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}
	@Override
	public String toString() {
		return "Flores [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", color=" + color + ", fechaIngreso="
				+ fechaIngreso + ", fechaSalida=" + fechaSalida + ", estado=" + estado + ", petalos=" + petalos
				+ ", cantidad=" + cantidad + ", costo=" + costo + "]";
	}
	
	
	
	

}
