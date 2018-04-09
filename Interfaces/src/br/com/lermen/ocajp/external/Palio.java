package br.com.lermen.ocajp.external;

import br.com.lermen.ocajp.Car;

/**
 * @author Andre
 * 
 */
public final class Palio implements Car {

	@Override
	public void potencia() {
		System.out.println(Car.CAVALOS);
	}

	@Override
	public int peso(int p) {
		return p * (int) Math.PI + 10;
	}

	public static void main(String[] args) {
		Palio p = new Palio();
		
		p.potencia();
		
		System.out.println(p.peso(50));
	}

}
