package br.com.string.split;

public class Main {

	public static void main(String[] args) {
		metodoSplit1();
		
		metodoSplit2();
		
		String str = "ola mundo java";
		
		System.out.println(str.toString());
		
	}

	/**
	 * 
	 * Met�do split
	 * 
	 */
	static void metodoSplit1() {
		double valor = 1.96;

		String str = String.valueOf(valor);

		System.out.println(str);

		String[] aux = str.split("\\.");

		System.out.println(aux[0]);
		System.out.println(aux[1]);

	}
	
	static void metodoSplit2() {
		
		String str = "minha:mao:tem5dedo?sim";
		
		String vetor[] = str.split("\\:|5|\\?");
		
		for(int i = 0; i < vetor.length; i++){
			System.out.println(vetor[i]);
		}
		
	}
}
