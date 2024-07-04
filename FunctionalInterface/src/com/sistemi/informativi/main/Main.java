package com.sistemi.informativi.main;

import com.sistemi.informativi.SportNews;

public class Main {

	public static void main(String[] args) {
		
		
		//interfaccia non si può istanziare
		
		
		/*
		 * la dichiarazione di una variabile di tipo interfaccia funxionale
		 * assegnata all'implementzione di una funzione rappresenta l'implementazione
		 * del metodo astratto dell'interfaccia funzionale
		 * (in pratica otteniamo un @Override del metodo astratto dell'interfaccia
		 * che in OOP, avremmo dovuto eseguire tramite una classe figlia dell'interfaccia)
		 */
		
		SportNews sportNews = ()->{
			
			System.out.println("Welcome");
		};
		
		sportNews.sayWalcome();
		sportNews.basketNews();
		SportNews.footBallNews();
		sportNews.volleyNews();
	}

}
