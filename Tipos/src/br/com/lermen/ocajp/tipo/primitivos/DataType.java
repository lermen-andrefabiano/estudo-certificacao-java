package br.com.lermen.ocajp.tipo.primitivos;

public class DataType {

	static byte b; // 0

	static short s; // 0
	
	static int i; // 0
	
	static long l; // 0
	
	static float f;	// 0.0
	
	static double d; // 0.0
	
	static char c;	// '{vazio}'
	
	static boolean bl; // false
	
	// objetos são null	
	static String str;
	
	static Boolean bool;
		
	static Double doulb;
	
	DataType(){
		b = 1;
	}
	
	{
		s = 2;
	}
	
	{
		s = 3;
	}
	
	static {
		c = 'A';
	}
	
	public static void main(String[] args) {
		
		new DataType();
		
		System.out.println(b); 
		System.out.println(s); 
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);		
		System.out.println(bl);
		
		
		System.out.println(str);
		System.out.println(bool);
		System.out.println(doulb);
	}

}
