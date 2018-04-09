package br.com.lermen.ocajp.tipo.vetor;

import java.util.Arrays;

public class A {

	static int v[] = { 100, 8, 5, -4, 2158, 78 };

	public static void main(String[] args) {

		System.out.println("vetor: " + Arrays.toString(v));

		System.out.println("ordenando...");

		Arrays.sort(v);

		System.out.println("vetor ordenado " + Arrays.toString(v));

		int index = Arrays.binarySearch(v, 5);

		System.out.println("posicao do elemento 5: " + index);

	}

}
