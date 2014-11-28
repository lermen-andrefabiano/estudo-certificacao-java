package br.com.lermen.acajp.abstr;

public class Main {

	public static void main(String[] args) {
		
		//Car r = new Car();

		Gerente g = new Gerente();
		
		Funcionario f = new Gerente();
		f.salario++;

		System.out.println("sal�rio: "+ g.getSalario() + " - bonifica��o: " + g.getBonificacao());

	}

}
