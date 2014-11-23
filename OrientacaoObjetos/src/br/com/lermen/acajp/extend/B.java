package br.com.lermen.acajp.extend;

public class B extends A {

	public void um() {		
		System.out.println("um do B");
	}

	public static void main(String[] args) {
		// System.out.println("B");

		A a = new B();

		a.um();
		
		System.out.println(a.p); //acesso ao membro protected
		
		

	}

	/*
	 * saída executa metodo construtor da classe A e o metodo da instacia de B B
	 * A1 um do B
	 */

}
