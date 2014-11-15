package br.com.oca.tipo.primitivos;

public class Tipo {
	
	static byte b; //8 bits - 1 byte
	
	static short s; //16 bits - 2 bytes
	
	static char c; //16 bits - 2 bytes
	
	int i; //32 bits - 4 bytes
	
	long l;//64 bits - 8 bytes
	
	float f;//32 bits - 4 bytes
	
	double d; //64 bits - 8 bytes
	
	public static void main(String[] args) {
		b = 127; // 128 n�o aceita, 128 ja � um int
		
		s = 32767; // 32768 n�o aceita, ja � um int
		
		c = 3;
		
		System.out.println(b);
		
		System.out.println(s);
		
		System.out.println(c);
		
		System.out.println(s - b);
	}
	
	

}
