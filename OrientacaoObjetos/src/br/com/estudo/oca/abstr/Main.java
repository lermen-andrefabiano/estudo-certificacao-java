package br.com.estudo.oca.abstr;

public class Main {

	public static void main(String[] args) {

		Gerente g = new Gerente();

		System.out.println("sal�rio: "+ g.getSalario() + " - bonifica��o: " + g.getBonificacao());

	}

}
