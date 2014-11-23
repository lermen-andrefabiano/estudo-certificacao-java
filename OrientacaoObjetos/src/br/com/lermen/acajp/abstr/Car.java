package br.com.lermen.acajp.abstr;

public abstract class Car {  // modificadores dos metodos so podem ser public ou protected

	private int passageiros;
	
	private char esterpe;
	
	private char mixInjection;	
	
	public abstract void getCor();
	
	public abstract void potencia();
	
	public String freio(){
		return "COM ABS";
	}
	
	protected abstract void acelerar();
	
	
}
