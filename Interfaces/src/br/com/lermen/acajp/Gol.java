package br.com.lermen.acajp;


public class Gol implements Car {

	@Override
	public void potencia() {
		int rodas = Car.RODAS;

	}

	@Override
	public int peso(int p) {
		return p * (int) Math.PI;
	}

	public static void main(String[] args) {
		int peso = new Gol().peso(10);

		System.out.println("peso do carro " + Gol.class.getName() + " " + peso);
	}

}
