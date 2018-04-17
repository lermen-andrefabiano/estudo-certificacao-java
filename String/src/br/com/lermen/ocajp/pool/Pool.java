package br.com.lermen.ocajp.pool;

public class Pool {

	public static void main(String[] args) {
		String str = "java";

		String str2 = "java";

		String str3 = new String("java");

		String str4 = new String("java");

		// str2 = str2.concat("lermen");

		// valor igual
		if (str.equals(str2)) {
			System.out.println("iguais");
		}

		// mesmo pool
		if (str == str2) {
			System.out.println("iguais");
		}

		// valor igual
		if (str3.equals(str4)) {
			System.out.println("iguais");
		}

		// nao ficam no mesmo pool por causa do new
		if (str3 == str4) {
			System.out.println("iguais");
		}

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
