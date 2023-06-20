package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;


@SpringBootApplication
public class Pa2U2P4AnApplication implements CommandLineRunner {

	@Autowired
	private EmpleadoService empleadoService;

	@Autowired
	private CiudadanoService ciudadanoService;
	

	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AnApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub


		Ciudadano ciud = new Ciudadano();
		ciud.setCedula("1719954370");
		ciud.setNombre("Carlos");
		ciud.setApellido("Oliveira");
		
		Ciudadano ciud1 = new Ciudadano();
		ciud1.setCedula("1119954323");
		ciud1.setNombre("Tony");
		ciud1.setApellido("Presidente");
	
		
		Empleado empl = new Empleado();
		empl.setCargo("Atencion al cliente");
		empl.setCiudadano(ciud1);
		empl.setSueldo(new BigDecimal(100));
		//ciud.setEmpleado(empl);
		
		this.ciudadanoService.agregar(ciud);
		this.empleadoService.agregar(empl);
		
		ciud1.setApellido("cacuango ");
		empl.setCargo("gerente");
		
		this.ciudadanoService.actualizar(ciud1);
		this.empleadoService.actualizar(empl);
		
		this.ciudadanoService.borrar(1);
		this.empleadoService.borrar(1);
		
		this.ciudadanoService.buscar(1);
		this.empleadoService.buscar(1);

		
	

	}

}
