package com.sistema.informativi.bean;

public class Persona {
	
	private String nome;
	
	private String cognome;
	
	private Integer age;
	
	
	//relazione HAS-A
	private Indirizzo indirizzo;


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Indirizzo getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public Persona() {
		
	}


	public Persona(String nome, String cognome, Integer age, Indirizzo indirizzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.age = age;
		this.indirizzo = indirizzo;
	}


	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", age=" + age + ", indirizzo=" + indirizzo + "]";
	}
	
	
}
