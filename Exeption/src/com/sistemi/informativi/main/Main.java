package com.sistemi.informativi.main;

import com.sistemi.informativi.buisness.Operazione;
import com.sistemi.informativi.exception.EccezioneCustom;
import com.sistemi.informativi.exception.GestioneEccezioneCustom;

public class Main {

	public static void main(String[] args) {
		
		
		Operazione operazione = new Operazione();
		
		try {
			
			operazione.divisione(7, 0);
		}
		catch(ArithmeticException ex){
			
			ex.printStackTrace();
		}
		
		GestioneEccezioneCustom eccezione = new GestioneEccezioneCustom();
		
		
		try {
			
			eccezione.ricevieta(15);
		}
		catch(EccezioneCustom ex){
			
			ex.printStackTrace();
		}
		
		
	}

}
