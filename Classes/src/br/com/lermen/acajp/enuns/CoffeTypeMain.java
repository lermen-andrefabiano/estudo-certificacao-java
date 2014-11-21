package br.com.lermen.acajp.enuns;

import java.lang.reflect.Field;

public class CoffeTypeMain {
	
	public static void main(String[] args) {
		Field [] f = CoffeType.class.getDeclaredFields();
		
		for(int i = 0; i < f.length; i++){
			System.out.println(f[i]);			
		}
	}

}
