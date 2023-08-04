package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciadosJava {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	public static String cedula() {
        return "000000211";
    }
	
	 public static boolean comparar(Integer numero) {
	        return numero >= 5;
	    }
	 
	 public static String convertir(Integer numero) {
	        return "Numeros convertidos fueron:" + numero;
	    }
	 
	 public static Integer multiplicar(Integer numero) {
		 LOG.info("Numeros multiplicados:");
		 Integer num = 1000;
		  numero = 10;
		   numero = numero * num;
	        return  numero;
	    }
}
