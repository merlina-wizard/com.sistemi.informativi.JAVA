package com.sistemi.informativi.buisness;  //

public class Operazione {
	
	public int somma(int x, int y) {
		return (x + y);
	}
	
	//Overload   dichiarare all'interno della stessa classe 1 o + metodi esattamente c
				//con lo stesso nome ma con firme diverse per quel che concerne la lista dei parametri 
				//ed eventualmente per il tipo di ritorno
	public int somma(int x, int y, int z) {
		
		return (x + y + z);
	}
}
