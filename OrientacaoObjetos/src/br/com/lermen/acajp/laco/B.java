package br.com.lermen.acajp.laco;

public class B {

	void usoContinue() {
		for (int i = 0; i < 100; i++) {
			if (i > 50 && i < 60) {
				continue;
			}
			System.out.println(i);
		}

		int t = 0;
	}

	public static void main(String[] args) {

		new B().usoContinue();
		
		A a = new A();
		System.out.println(a.pro); // acesso permitido ao mebro protected

	}

}
