package com.sistemi.informativi;

public class Main {

	public static void main(String[] args) {
		/*
		 * 
		 * ogni oggetto ha un ciclo di vita (gestito nell' HEAP);
		 * nascita = quando si usa new + costruttore;
		 * 
		 * stato di un oggetto = reppresentato dal contenuto (insieme di valori e variabili d'istanza) di un oggetto
		 * 
		 * ugaglianza fra oggetti = 2 oggetti sono considerati uguali solo quando hanno gli stessi valori;
		 * ugaglianza fra refernce = quando referenziano lo stesso indirizzo di memoria;
		 * 
		 */
		Person p1 = new Person();
		/*    p1 = (referance all'oggetto person)riferimento all'ogetto;m
		 * reference(stack)  un controllo/modifica lo stato  da remoto dell'oggetto(heap);
		 * come fai a creare un ogetto ? uso la parola chivae new + il costruttore della classe 
		 * (metodo speciale con lo stesso nome della clesse e non ha alcun tipo di ritorno)
		 * 
		 */
		p1.firstName = "HO";
		p1.lastName = "SONNO";
		p1.age = 21;
		
		System.out.println(p1.firstName + " " + p1.lastName + " " + p1.age);
		
		p1 = null;
		
		System.gc(); //BAD PRACTISE!!! perchè l'algoritmo del (JVM)gc può essere ottimizzato e cambiato. (
		             //le JVM complesse potrebbero enable del system.gc()
	
		/*
		 * garbage collector se metto una variabile = NULL sto rendendo l'oggetto Eligibile FOR DETRUCTION;
		 */
	}

}
