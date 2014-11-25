package br.com.lermen.acajp.tipo.vetor;

public class M {

	static int m[][] = { { 1, 2, 3, 5, 3 }, { 4, 5, 3, 9 }, { 7, 8, 10, 20 } };

	public static void main(String[] args) {
		goMatriz();
	}

	static void goMatriz() {
		for (int i = 0; i < m.length; i++) {
			System.out.println("indice: " + i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.println(m[i][j]);
			}
		}
	}

}
