package com.sistemi.informativi.bean;

public class Company {

	private String buisnessName;

	private String vatNumber;

	public String getBuisnessName() {
		return buisnessName;
	}

	public void setBuisnessName(String buisnessName) {
		this.buisnessName = buisnessName;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public Company(String buisnessName, String vatNumber) {
		super();
		this.buisnessName = buisnessName;
		this.vatNumber = vatNumber;
	}

	public Company() {

	}

	@Override
	public String toString() {
		return "Company [buisnessName=" + buisnessName + ", vatNumber=" + vatNumber + "]";
	}

}
