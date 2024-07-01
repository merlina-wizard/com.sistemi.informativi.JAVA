package com.sistema.informativi.bean;

public class Indirizzo {

	private String via;

	private String numeroCivico;

	private String cap;

	private String citta;

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public Indirizzo(String via, String numeroCivico, String cap, String citta) {
		super();
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.cap = cap;
		this.citta = citta;
	}

	public Indirizzo() {

	}

	@Override
	public String toString() {
		return "Indirizzo [via=" + via + ", numeroCivico=" + numeroCivico + ", cap=" + cap + ", citta=" + citta + "]";
	}

}
