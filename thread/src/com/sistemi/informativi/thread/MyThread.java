package com.sistemi.informativi.thread;

public class MyThread extends Thread{

	//si usano quando una risorsa viene condivisa da più processi
	
	/*
	 * x implementazione
	 * 
	 * 1. creazione classe che extends Thread
	 * 
	 * 2. metodo public void run() = risorsa condivisa
	 * 
	 * 3.
	 */
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			System.out.println(Thread.holdsLock(Thread.currentThread().getName()));
			
			Thread.sleep(500);
		}
		
	}
}
