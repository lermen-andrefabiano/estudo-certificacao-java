package br.com.lermen.acajp.tipo.vetor;

import java.util.Arrays;

public class V {	

	static int v[] = { 10, 20, 30, 40, 50 };

	static int[] v2 = { 100, 200, 300, 400, 500 };
	
	static int[] v3 = new int[5]; // assim print tudo "zero"
	
	//static int[] v3; se usar ele assim java.lang.NullPointerException

	public static void main(String[] args) {

		goV();
		
		goV2();
		
		goV3();
		
		System.out.println(Arrays.toString(v));

	}

	static void goV() {	
		for (int i = 0; i < v.length; i++) {			
			System.out.println(v[i]);
		}
	}

	static void goV2() {
		for (int i = 0; i < v2.length; i++) {
			System.out.println(v2[i]);
		}
	}
	
	static void goV3() {
		for (int i = 0; i < v3.length; i++) {
			System.out.println(v3[i]);
		}
	}

}
