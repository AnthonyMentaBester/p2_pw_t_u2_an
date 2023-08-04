package com.example.demo.funcional;



public class PersonaPredicateImpl implements IPersonaPredicate<String> {
	

    @Override
    public boolean evaluar(String arg) {
        // TODO Auto-generated method stub
        String caracter = "#holas";
        if (caracter.contains("#")) {
			return true;
		} else {
			return false;
		}
    }
    
}
