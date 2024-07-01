package com.sistemi.informativi.main;

import com.sistemi.informativi.buisness.Operazione;

public class Main {

	public static void main(String[] args) {
		Operazione operazione = new Operazione();
		
		System.out.println(operazione.somma(2, 7, 0));
		System.out.println(operazione.somma(2, 0));
	}

}
