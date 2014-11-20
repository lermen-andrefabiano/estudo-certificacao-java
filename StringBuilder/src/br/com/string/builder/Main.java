package br.com.string.builder;

public class Main {
	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		
		str.append("andre ")
		.append("joao ")
		.append("rafael ");
		
		System.out.println(str.toString());
		
		str.insert(0, "predro ");
		
		System.out.println(str.toString());		
		
		str.delete(0, 1);
		
		System.out.println(str.toString());
		
	}

}
