
package com.sistemi.informativi.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.sistemi.informativi.bean.Company;
import com.sistemi.informativi.bean.Course;

public class Main {

	public static void main(String[] args) {	
			
			int arrayInt [] = {0,1,2};
//			int arrayInt [] = new int [3];
//			arrayInt [0] = 0;
//			arrayInt [1] = 1;
//			arrayInt [2] = 2;
			
			for(int i = 0; i<arrayInt.length; i++){
				
				System.out.println(arrayInt[i]);
		}
			
		Integer arrayInteger [] = new Integer [3];
		
		arrayInteger[0] = 3;
		arrayInteger[1] = 4;
		arrayInteger[2] = 5;
		
		//forEach o forEnhanced
		for (Integer i : arrayInteger) {
			
			System.out.println(i);
			
		}
		
		//anche se andremo ad inserrire refernce di tipo object che puntano a classi diverse va bene
		Object array [] = new Object [2];
		
		array [0] = new Course("655865", "java", "Rome");
		array [1] = new Company("Openjob", "iva");
		
		for (Object i : array) {
			System.out.println(i);
		} 
		
		//<course> generics che consente di specificare  (inizializzazione struttura dinamica)
		//il tipo degli elementi da inserire
		//x omogenee <elemento da inserire>
		//x eterogenee <Objects>
		ArrayList<Object>courseList = new ArrayList<>();
		
		courseList.add(new Course("655865", "java", "Rome"));
		
		courseList.add(new Company("Openjob", "iva"));
		
		for (Object i : courseList) {
			System.out.println("ciao " + i);
		} 	
		
		// courseList.remove(0); 
		
		courseList.remove(new Course("655865", "java", "Rome"));
		
		
		for (Object i : courseList) {
			System.out.println("ciao " + i);
		}
		
		
		HashSet<String> dayList = new HashSet<>();
		
		dayList.add("Lunedì");
		dayList.add("martedì");
		dayList.add("mercoledì");
		dayList.add("Giovedì");
		dayList.add("Venerdì");
		dayList.add("Lunedì");
		
		for (String i : dayList) {
			System.out.println("Lavora " + i);
		}
	
		ArrayList<Integer>number = new ArrayList<>();
		
		number.add(4);
		number.add(11);
		
		//forEach funzionale
						//funzione ANONIMA
		number.forEach((contenuto)->System.out.println("number = " + number));
		
		//se voglio che funzione equals e hashcode per paragonare 2 oggetti dobbiamo @Overridare 
		//eqauls e hashcode all'interno della classe che genera le classe che vogliamo confrontare
		
		HashMap<Integer, Course>courseMap = new HashMap<>();
		
		Course courseUno = new Course("655865", "java", "Rome");
		Course courseDue = new Course("659843", "C", "Rome");
		
		courseMap.put(1, courseUno);
		courseMap.put(2, courseDue);
		
		//System.out.println(courseMap);
		courseMap.forEach((key, values)-> System.out.println("meso rotta tanto " + key + "ho fame " + values));
			
	}
		
}