package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="arreglos")
@Entity
public class Arreglos {

     @GeneratedValue(generator = "seq_arreglos", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_arreglos", sequenceName = "seq_arreglos",allocationSize = 1)
    @Id
    @Column(name = "arr_id")
    private Integer id;
    @Column(name = "arr_numero")
    private String numero;
    @Column(name = "arr_valor")
    private BigDecimal valor;
    @ManyToOne
    @JoinColumn(name = "arr_id_flores")
    private Flores flores;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Flores getFlores() {
        return flores;
    }
    public void setFlores(Flores flores) {
        this.flores = flores;
    }
    @Override
    public String toString() {
        return "Arreglos [id=" + id + ", numero=" + numero + ", valor=" + valor + "]";
    }

    
    
}
