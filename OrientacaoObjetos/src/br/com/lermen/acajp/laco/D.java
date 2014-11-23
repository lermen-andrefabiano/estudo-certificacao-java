package br.com.lermen.acajp.laco;

public class D extends br.com.lermen.acajp.extend.A{
	
	void go(){
		int i = 0;
		
		while(i == 0){
			System.out.println("while");
			i++;
		}
		
		do{
			System.out.println("do while");
			i++;
		}while(i == 1);
		
		
		p = 1; // acesso ao mebro protected da classe A do pacote externo
		
	}
	
	public static void main(String[] args) {
		new D().go();
	}

}
