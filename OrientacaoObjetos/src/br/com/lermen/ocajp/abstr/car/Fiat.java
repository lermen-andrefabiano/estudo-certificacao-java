package br.com.lermen.ocajp.abstr.car;

import br.com.lermen.ocajp.abstr.Car;

abstract class Fiat extends Car {

	public abstract void isFiat();
	
	public final void naoMudaNunca(){
		System.out.println("método final nunca muda");
	};

	public void motor() {		
		setMixInjection('S');
		
		System.out.println("motor com MixInjection: "+ getMixInjection());
		
		
	}
	

}
