package com.sistemi.informativi.main;

import com.sistemi.informativi.DocenteJava;
import com.sistemi.informativi.Docente;

public class Main {

	public static void main(String[] args) {
		
		//reference e oggetto sono dello stesso tipo
		DocenteJava docenteJava = new DocenteJava();
		
		docenteJava.spiegazioniArchitettura();
		docenteJava.spiegazioniFramework();
		docenteJava.spiegazioniLinguaggio();
		
		//reference interface e ogetto tipo classe figlio ----> Polimorfismo
		Docente docenteJavaNew = new DocenteJava(); 
		
		docenteJavaNew.spiegazioniArchitettura();
		docenteJavaNew.spiegazioniFramework();   //utilizzando questo metodo il main vede la signature del metodo ma 
		docenteJavaNew.spiegazioniLinguaggio();  //non ha accesso al corpo del metodo:
		
		//implementare il POLIMOFISSMO di oggetti si traduce nel dichiarare 
		//una reference di tipo padre che referenzia un oggetto di tipo figlio
		
		//Polimorfismo di oggetti vuol dire far assumere ad una reference di tipo padre la forma di 
		//uno dei suoi oggetti figli a runtime, limitato alle componenti applicative in comune
		
		//applicare il POLIMORFISMO di OGGETTI utilizzando reference di tipo interfaccia padre e oggetto di tipo classe figlio
		//rappresenta un implementazione intrinseca del PATTERN LOOSE COUPLING

	}
}
