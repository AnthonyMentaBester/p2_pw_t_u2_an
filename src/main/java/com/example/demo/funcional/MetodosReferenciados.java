package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {
	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados .class);


	public static Integer getID() {
	
		return 8;
	}
	public static void aceptar(String arg) {
		String cadena = "Anthony";
		LOG.info(cadena+ " " + arg);
	}
	
	public static boolean comparar(String arg) {
		String caracter = "#hola";
		LOG.info(caracter+ " " + arg);
		if(caracter.contains("#")) {
			return true;
		}
			else {
				return false;
				}
	}
	
	public static String getIdHO() {
	
		LOG.info("Metodos referenciados y HO");
		return "Anthonyn narvaez";
	}
	
	public static String aplicar(Integer arg) {
		// TODO Auto-generated method stub
		 Integer num = 6+arg;
		String cadena= num.toString().concat(" el 6 fue transformado a texto");
		LOG.info(cadena+ " " + num);
		return cadena;
	}
	
	public static Integer producto(Integer arg) {
		// TODO Auto-generated method stub
		Integer num = 66 * arg;
		Integer mult = num *212;
		LOG.info(mult+ " * " + arg);
		return mult;
	}
	
}
