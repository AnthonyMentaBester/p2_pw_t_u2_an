package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;

@SpringBootApplication
public class Pa2U2P4AnApplication implements CommandLineRunner {

	@Autowired
	private HabitacionService habitacionService;

	@Autowired
	private HotelService hotelService;

	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AnApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Hotel hot = new Hotel();
		hot.setNombre("Aton");
		hot.setDireccion("lil street");
		
		Hotel hot2 = new Hotel();
		hot2.setNombre("hilton");
		hot2.setDireccion("lovely");
		
		
		List<Habitacion> habi = new ArrayList<>();
        Habitacion hab1 = new Habitacion();
	    hab1.setNumero("1719");
		hab1.setValor(new BigDecimal(100));
		habi.add(hab1);
		hot.setHabitaciones(habi);	
		
        Habitacion hab2 = new Habitacion();
	    hab2.setNumero("1719");
		hab2.setValor(new BigDecimal(200));
		habi.add(hab2);
		hot.setHabitaciones(habi);	
		
		hab1.setHotel(hot);
		hab2.setHotel(hot);
		
		
		//this.habitacionService.agregar(hab1);
		//this.habitacionService.agregar(hab2);
		this.hotelService.agregar(hot);
		
		hot.setDireccion("av las americas");
		hab1.setNumero("23a");
		
		this.hotelService.actualizar(hot);
		this.habitacionService.actualizar(hab1);
		
		this.habitacionService.borrar(1);
		
		
		this.hotelService.buscar(1);
		this.habitacionService.buscar(1);
	

	}

}
