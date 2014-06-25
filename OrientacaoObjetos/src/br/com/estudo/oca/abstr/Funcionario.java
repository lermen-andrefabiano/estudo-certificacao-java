package br.com.estudo.oca.abstr;

abstract class Funcionario {

	protected double salario;

	public double getBonificacao() {
		return this.salario * 1.2;
	}
	
	abstract double getSalario();

}
