package br.com.lermen.ocajp.laco;

public class A {
	
	protected int pro = 10;

	static void c() {
		for (int i = -10; i < 10; i++) {
			if (i == 0)
				continue;
			System.out.println(i);
		}
	}

	static void b() {
		int i = 0;
		while (true) {
			System.out.println(i);
			if (i++ >= 10)
				break;
		}
	}

	public static void main(String[] args) {
		b();
		// c();
	}

}
