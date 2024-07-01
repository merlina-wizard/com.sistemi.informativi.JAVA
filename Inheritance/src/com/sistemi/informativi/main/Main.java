package com.sistemi.informativi.main;

import com.sistemi.informativi.Persona;
import com.sistemi.informativi.Studente;
import com.sistemi.informativi.*; //per prendere tutto il pacchetto ma BEST PRACTICE è quella di aggiungerne 1 x 1

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.cammina();
		persona.dorme();
		persona.mangia();
		
		Studente studente = new Studente();
		
		studente.cammina();
		studente.mangia();
		studente.cammina();
		studente.studia();
		
		StudenteScolastico studenteScolastico = new StudenteScolastico();
		
		studenteScolastico.cammina();
		studenteScolastico.dorme();
		studenteScolastico.mangia();
		studenteScolastico.studia();

		StudenteUniversitario studenteUniversitario = new StudenteUniversitario();
		
		studenteUniversitario.studia();
	}
   
}
