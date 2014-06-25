package br.com.estudo.oca.polimorfismo;

public class B extends A{
	
	public void ano(){
		System.out.println("2014 06");
	}
	
	void polimosfismo(){
		
		ano();
		
		super.ano();
		
	}
}
