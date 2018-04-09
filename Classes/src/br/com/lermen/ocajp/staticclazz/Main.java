package br.com.lermen.ocajp.staticclazz;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		S s1 = new S();
		s1.incrementaContador();
		s1.incrementaOutroContador();

		S s2 = new S();
		s2.incrementaContador();
		s2.incrementaOutroContador();

		S s3 = new S();
		s3.incrementaContador();
		s3.incrementaOutroContador();

		S s4 = new S();
		s4.incrementaContador();
		s4.incrementaOutroContador();
	}

}
