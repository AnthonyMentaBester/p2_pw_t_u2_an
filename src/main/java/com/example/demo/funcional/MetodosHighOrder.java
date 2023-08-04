package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosHighOrder {
	
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	
	public void metodo(IPersonaSupplier<String> function)  {
		
	LOG.info("metodo high order supplier: " + function.getId());
	
	}
	
	public void acceso(IPersonaConsumer<String> function,String cadena) {
		LOG.info("metodo high order consumer: ");
		function.accept(cadena);
	}

	public void valorar(IPersonaPredicate<String> function,String cadena) {
		LOG.info("metodo high order predicate: " + function.evaluar(cadena));
	}
	
	public void tranformar(IPersonaFunction<String, Integer> function, Integer num) {
		LOG.info("metodo high order function: " + function.aplicar(num));
		
	}
	
	public void mantener(IPersonaUnaryOperator<Integer> function, Integer num) {
		LOG.info("metodo high order Unary Operator: " + function.aplicar(num));
		
	}

}
