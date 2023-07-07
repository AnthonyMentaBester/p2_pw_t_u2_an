package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Flores;
import com.example.demo.service.FloresService;



@SpringBootApplication
public class Pa2U2P4AnApplication implements CommandLineRunner {
	
	@Autowired
	private FloresService floresService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AnApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Flores fl = new Flores();
		fl.setNombre("rosas");
		fl.setColor("amarillo");
		fl.setPetalos(new Double(7));
		fl.setEstado("marchitas");
		fl.setTipo("Angiospermas");
		fl.setCosto(new BigDecimal(24));
		fl.setFechaIngreso(LocalDate.of(2023, 05, 4));
		fl.setFechaSalida(LocalDate.of(2023, 8, 10));
		fl.setCantidad(new BigDecimal(7));
		//this.floresService.agregar(fl);
		
		System.out.println(this.floresService.seleccionarFloresDinamicoCriteriaQuery("acasias"));
		
        
        
	}

}
