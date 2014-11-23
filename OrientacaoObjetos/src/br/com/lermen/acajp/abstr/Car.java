package br.com.lermen.acajp.abstr;

public abstract class Car { // modificadores dos metodos so podem ser public ou
							// protected

	public int passageiros;

	private char esterpe;

	private char mixInjection;

	public abstract void getCor();

	public abstract void potencia();

	protected abstract void acelerar();

	public String freio() {
		return "COM ABS";
	}

	public char getEsterpe() {
		return esterpe;
	}

	public void setEsterpe(char esterpe) {
		this.esterpe = esterpe;
	}

	public char getMixInjection() {
		return mixInjection;
	}

	public void setMixInjection(char mixInjection) {
		this.mixInjection = mixInjection;
	}

}
