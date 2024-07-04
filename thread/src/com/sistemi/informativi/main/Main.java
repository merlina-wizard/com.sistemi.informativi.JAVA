package com.sistemi.informativi.main;

import com.sistemi.informativi.thread.MyThread;

public class Main {

	public static void main(String[] args) {
		
		Thread t1 = new MyThread(); //ciclo di vita di 5 stadi 
		//(new,runnable(start),running(accesso alla risolrsa condivisa),blocked(buttato fuori dalla risorsa condivisa),dead)
		
		Thread t2 = new MyThread();

		Thread t3 = new MyThread();
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
	}

}
