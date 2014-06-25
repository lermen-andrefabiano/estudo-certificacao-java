package br.com.string;



public class ClassString{

	public static void main(String[] args) {

		// declaração e instanciação (mais prático)
		String ola = "Alô Mundo Java !";
		String nome = "Prof. Omero Francisco Bertol.";

		// concatenação (\n = pula linha)
		String aula = ola + "\nby " + nome;
		System.out.println(aula);
				
		int i;
		for (i=48; i<=57; i++) { 
			//System.out.printf("%c", i); 
		}
		
		System.out.printf("\n");
		
		ola.concat(" ola atx");
		
		nome += "e maria";
		
		System.out.println(ola);
		
		System.out.println(nome);		
		
	}
	

}
