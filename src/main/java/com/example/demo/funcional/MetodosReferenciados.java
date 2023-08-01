package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {
	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados .class);


	public Integer getID() {
	
		return 8;
	}
	public void aceptar(String arg) {
		String cadena = "Anthony";
		LOG.info(cadena+ " " + arg);
	}
	
	public boolean comparar(String arg) {
		String caracter = "#";
		if(caracter.contains(caracter)) {
			return true;
		}
			else {
				return false;
				}		
	}
	public String transformar(Integer numero) {
		String cadena  = numero.toString().concat("el valor fue tranformado");
		return cadena;
	}
	
	public Integer sumar(Integer numero) {
		Integer suma  = numero+9;
		return suma;
	}
	
}
