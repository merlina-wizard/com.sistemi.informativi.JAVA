package com.sistemi.informativi;

@FunctionalInterface
public interface SportNews {
	
	public void sayWalcome();
	
	public default void basketNews(){
		
		System.out.println("Pallaaa nel canestroo!!");
		
	}
	
	public default void volleyNews(){
		
		System.out.println("Pallaaa non cadere!!");
		
	}
	
	public static void footBallNews(){
		
		System.out.println("Pallaaa nella porta!!");
		
	}
	
	

}
