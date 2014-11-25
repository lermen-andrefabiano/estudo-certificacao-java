package br.com.lermen.acajp.abstr.car;

public class Palio extends Fiat {

	@Override
	public void isFiat() {
		passageiros = 5;
		
		setEsterpe('S');
	}

	@Override
	public void getCor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void potencia() {
		naoMudaNunca();

	}

	@Override
	protected void acelerar() {
		super.motor();
	}
	
	public static void main(String[] args) {
		new Palio().acelerar();
	}	

}
