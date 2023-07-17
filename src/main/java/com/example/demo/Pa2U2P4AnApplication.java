package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Arreglos;
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
		
		List<Flores> flr = this.floresService.buscarInnerJoin();
		for (Flores flores : flr) {
			System.out.println(flores);
		}
		
		List<Flores> flr1 = this.floresService.buscarInnerJoin1();
		for (Flores flores : flr1) {
			System.out.println(flores);
		}
	
		List<Flores> flr2 = this.floresService.buscarOuterLeftJoin();
		for (Flores flores : flr2) {
			System.out.println(flores);
		}
		
		List<Flores> flr3 = this.floresService.buscarOuterLeftJoin1();
		for (Flores flores : flr3) {
			System.out.println(flores);
		}
        
		
		List<Flores> flr4 = this.floresService.buscarOuterRightJoin();
		for (Flores flores : flr4) {
			System.out.println(flores);
		}
        
		
		List<Flores> flr5 = this.floresService.buscarOuterRightJoin1();
		for (Flores flores : flr5) {
			System.out.println(flores);
		}
        
		
		List<Flores> flr6 = this.floresService.buscarOuterFullJoin();
		for (Flores flores : flr6) {
			System.out.println(flores);
		}
        
		
		List<Flores> flr7 = this.floresService.buscarOuterFullJoin1();
		for (Flores flores : flr7) {
			System.out.println(flores);
		}
        
		
		List<Flores> flr8 = this.floresService.buscarWhereJoin();
		for (Flores flores : flr8) {
			System.out.println(flores);
		}
        
		
		List<Flores> flr9 = this.floresService.buscarWhereJoin1();
		for (Flores flores : flr9) {
			System.out.println(flores);
		}
		
		List<Flores> flr10 = this.floresService.buscarFetchJoin();
		for (Flores flores : flr10) {
			System.out.println(flores);
			for (Arreglos arreglos : flores.getArreglos()) {
				System.out.println(arreglos.getNumero());
			}
		}
        
		List<Flores> flr11 = this.floresService.buscarFetchJoin1();
		for (Flores flores : flr11) {
			System.out.println(flores);
			for (Arreglos arreglos : flores.getArreglos()) {
				System.out.println(arreglos.getValor());
			}
		}
		
		
        
        
        
		
		
		
		
		
        
	}

}
