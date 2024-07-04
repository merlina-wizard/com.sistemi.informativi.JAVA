package com.sistemi.informativi.bean;
//JAVA BEAN = una classe contenente variabili d'istanza, set/get per ogni variabile d'istanz, e almeno il costruttore vuoto)
//una classe che non contiene metodi che implementano BUISNESS LOGIC(insieme del codice che esegue le seguenti operazioni 1)calcoli 2)controlli 3)conversione dati

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private int age;

	public String getFirstName() {
		return firstName;
	}

	// signature/firma (stato visibilità, ritorno, nome, input)
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
