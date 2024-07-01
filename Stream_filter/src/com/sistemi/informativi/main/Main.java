package com.sistemi.informativi.main;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Stream<String> colorStream = Stream.of("blue", "red", "yellow");
		
		Stream<String> colorStreamNew = Stream.concat(Stream.of("brown"), colorStream);
		
		colorStreamNew.forEach(elementi->System.out.println(elementi));
		
		//char arrayColor[colorStreamNew.count()] = new char [];
		
		Stream<String> courseStream = Stream.of("java", ".net", "Angular");
		
		// filter= operatore funzionale ad uno stream di partenza restituisce un nuovo Stream 
		// sulla base della verifica di una condizione richiesta al filter
		courseStream.filter((course)->course.equals("Angular")).forEach(course->System.out.println(course));
		
		//utilizzando un operatore sullo stream dobbiamo fare tutte le operazioni prima dell'operatore (;)
		
		Stream<Integer> numbersStream = Stream.of(3 , 1 , 4, 4);
		
		numbersStream.map((number)->number*2).sorted().distinct().forEach(number->System.out.println(number));

		
	}

}
