package br.com.lermen.ocajp.string;



public class ClassString{

	public static void main(String[] args) {

		// declaração de instancia mais pratica
		String ola = "Ola Mundo Java !";
		String nome = "Prof. Omero Francisco Bertol";

		// concatena��o (\n = pula linha)
		String aula = ola + "\nby " + nome;
		System.out.println(aula);
				
		int i;
		for (i=48; i<=57; i++) { 
			//System.out.printf("%c", i); 
		}
		
		System.out.printf("\n");
		
		ola.concat(" ola Java");
		
		nome += " e maria";
		
		System.out.println(ola);
		
		System.out.println(nome);		
		
	}
	

}
