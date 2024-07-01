package com.sistemi.informativi.exception;

public class GestioneEccezioneCustom {
	
	public void ricevieta(int eta) throws EccezioneCustom {
		
		if (eta > 18)
			System.out.println(eta);
		else
			throw new EccezioneCustom("eta inferiore i 18");
				
	}
	
	
}
