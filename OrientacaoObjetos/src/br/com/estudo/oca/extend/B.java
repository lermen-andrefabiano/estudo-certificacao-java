package br.com.estudo.oca.extend;

public class B extends A{

	public static void main(String[] args) {
		System.out.println("B");
		
		A a = new B();	
		
		a.um();
		
	}
	
}
