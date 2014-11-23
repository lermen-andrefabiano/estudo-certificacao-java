package br.com.lermen.acajp.abstr.car;

import br.com.lermen.acajp.abstr.Car;

abstract class Fiat extends Car {

	public abstract void isFiat();

	public void motor() {		
		setMixInjection('S');
		
		System.out.println("motor com MixInjection: "+ getMixInjection());
	}

}
