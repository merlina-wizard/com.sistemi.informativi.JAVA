package com.sistema.informativi.main;

import com.sistema.informativi.bean.Indirizzo;
import com.sistema.informativi.bean.Persona;


public class Main {

	public static void main(String[] args) {
		
		Indirizzo indirizzo = new Indirizzo("via imola", "13", "00040", "Roma");
		
		Persona persona = new Persona("Martina", "Merlini", 22, indirizzo);
		
		System.out.println(persona.toString());

	}

}
