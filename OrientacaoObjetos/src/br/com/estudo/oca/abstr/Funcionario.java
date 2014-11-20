package br.com.estudo.oca.abstr;

abstract class Funcionario {

	protected double salario;
	
	public int hoje(){
		return 1;
	}

	public double getBonificacao() {
		return this.salario * 1.2;
	}

	abstract double getSalario();
	
	abstract String um();

}
