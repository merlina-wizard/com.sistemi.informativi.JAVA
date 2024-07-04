package com.sistemi.informativi.main;

import com.sistemi.informativi.*;

public class Main extends Object{

	public static void main(String[] args) {
		
		AziendaInformatica aziendaInformatica = new AziendaInformatica();
		
		aziendaInformatica.assume();
		aziendaInformatica.fattura();
		
		AziendaMeccanica aziendaMeccanica = new AziendaMeccanica();
		
		aziendaMeccanica.assume();
		aziendaMeccanica.fattura();

	}

}
