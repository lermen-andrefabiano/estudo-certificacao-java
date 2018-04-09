package br.com.lermen.ocajp.extend;

public class B extends A {

	public void um() {		
		System.out.println("um do B");
	}

	public static void main(String[] args) {
		// System.out.println("B");
		
		B b = new B();

		A a = new B();
		a.um();
		
		//B b1 = new A(); // a super classe pode receber uma instancia da sub classe, mas a sub classe não pode receber uma instancia da super classe
		
		System.out.println(a.p); //acesso ao membro protected	

	}

	/*
	 * saída executa metodo construtor da classe A e o metodo da instacia de B B
	 * A1 um do B
	 */

}
