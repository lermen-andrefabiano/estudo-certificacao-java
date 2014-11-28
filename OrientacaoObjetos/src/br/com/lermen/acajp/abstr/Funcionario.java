package br.com.lermen.acajp.abstr;

abstract class Funcionario {

	protected double salario;
	
	public int hoje(){
		return 1;
	}

	public double getBonificacao() {
		return this.salario * 1.2;
	}
	
	public final char getSal(){
		return 'A';
	}

	abstract double getSalario();
	
	abstract String um();

}
