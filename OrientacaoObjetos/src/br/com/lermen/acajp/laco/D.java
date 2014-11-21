package br.com.lermen.acajp.laco;

public class D {
	
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
		
	}
	
	public static void main(String[] args) {
		new D().go();
	}

}
