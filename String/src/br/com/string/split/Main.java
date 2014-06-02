package br.com.string.split;

public class Main {

	public static void main(String[] args) {
		metodoSplit();
	}

	/**
	 * 
	 * Metódo split
	 * 
	 */
	static void metodoSplit() {
		double valor = 1.96;

		String str = String.valueOf(valor);

		System.out.println(str);

		String[] aux = str.split("\\.");

		System.out.println(aux[0]);
		System.out.println(aux[1]);

	}
}
