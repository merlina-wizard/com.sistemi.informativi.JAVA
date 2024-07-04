package com.sistemiinformativi.enumeration;

public enum Pasto {
	
	COLAZIONE(8, "SALA A"),
	PRANZO(13, "SALA B"),
	MERENDA(17, "SALA C"),
	CENA(20, "SALA D");
	
	private int ora;
	
	private String luogo;

	
	
	public int getOra() {
		return ora;
	}


	public String getLuogo() {
		return luogo;
	}

	private Pasto(int ora, String luogo) {
		this.ora = ora;
		this.luogo = luogo;
	}
	
	//enum = creare una struttura informativa rigida!
	
	
}
