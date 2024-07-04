package com.sistemi.informativi;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	//creando un costruttore custom perdo il costruttore di default
	//riscrivendolo esplicitamente però si può recuperare
	public Person(String firstName, String lastName, int age) {
		//super(); //eridarietèà -> richiama costruttore della super classe
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	} 
	
	public Person() {
	
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	

}
