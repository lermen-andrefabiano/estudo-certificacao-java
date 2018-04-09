package br.com.lermen.ocajp.staticclazz;

public class S {
	
	// Variavel static  
    public static int contador = 0;  
  
    // Variavel nao-static  
    public int outroContador = 0;  
  
    public S() {    	
    }  
  
    // Precisa ser static porque "contador" é static  
    public static void incrementaContador(){  
        contador++;  
  
        System.out.println("contador agora é "+ contador);  
    }  
  
    public void incrementaOutroContador(){  
        outroContador++;  
  
		System.out.println("outroContador agora é " + outroContador);  
    }  

}
