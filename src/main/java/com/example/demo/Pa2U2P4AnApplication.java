package com.example.demo;

import java.math.BigDecimal;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Zapato;
import com.example.demo.service.ZapatoService;




@SpringBootApplication
public class Pa2U2P4AnApplication implements CommandLineRunner {


	@Autowired
	private ZapatoService zapatoService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AnApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Zapato zap1 = new Zapato();
		zap1.setMarca("Adidas");
		zap1.setPrecio(new BigDecimal(100));
		
		Zapato zap2 = new Zapato();
		zap2.setMarca("Adidas");
		zap2.setPrecio(new BigDecimal(100));
		
		Zapato zap3 = new Zapato();
		zap3.setMarca("Rebook");
		zap3.setPrecio(new BigDecimal(200));
		
		//this.zapatoService.agregar(zap1);
		//this.zapatoService.agregar(zap2);
		//this.zapatoService.agregar(zap3);
		
		
	
		Zapato zap = this.zapatoService.buscarPorMarca("Rebook");
		System.out.println(zap);
		
	
		List<Zapato> zap4 = this.zapatoService.buscarListaPorListaMarca("Adidas");
			
		for (Zapato zapatos : zap4) {
			System.out.println(zapatos);
		}
		
		//typed 
		Zapato zap5 = this.zapatoService.buscarPorPrecioTyped(new BigDecimal(200));
		System.out.println(zap5);
		
		
		List<Zapato> zap6 = this.zapatoService.buscarListaPorPrecioTyped(new BigDecimal(100));
		
		for (Zapato zapatos : zap6) {
			System.out.println(zapatos);
		}
		
	

	}

}
