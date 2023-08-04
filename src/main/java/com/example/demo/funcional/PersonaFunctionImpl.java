package com.example.demo.funcional;

public class PersonaFunctionImpl implements IPersonaFunction<String, Integer>{

	@Override
	public String aplicar(Integer num) {
		// TODO Auto-generated method stub
		 num = 6;
		String cadena= num.toString().concat(" el 6 fue transformado a texto");
			
		return cadena;
	}

}
