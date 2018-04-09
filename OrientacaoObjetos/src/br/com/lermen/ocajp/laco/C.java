package br.com.lermen.ocajp.laco;

public class C extends B{
	
	@Override
	void usoContinue() {
		super.usoContinue();
	}
	
	public static void main(String[] args) {
		br.com.lermen.ocajp.extend.A a = new br.com.lermen.ocajp.extend.A();
		
		//a.p nso é possicel acessar o membro protected da classe A de outro pacote
	}

}
