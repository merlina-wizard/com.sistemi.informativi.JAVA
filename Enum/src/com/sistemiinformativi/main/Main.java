package com.sistemiinformativi.main;

import java.util.ArrayList;
import java.util.TreeMap;

import com.sistemiinformativi.enumeration.Pasto;
import com.sistemiinformativi.enumeration.Settimana;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Settimana> giorni = new ArrayList<>();
		
		for(Settimana giorno : Settimana.values()) {
			
			giorni.add(giorno);
			
		}
		
		System.out.println(giorni);
			
		TreeMap<Integer,String> pasti = new TreeMap<>();
		
		for(Pasto oraLuogo : Pasto.values()) {
			
			pasti.put(oraLuogo.getOra(), oraLuogo.getLuogo());
			
		}
		
		System.out.println(pasti);
			
	}

}
