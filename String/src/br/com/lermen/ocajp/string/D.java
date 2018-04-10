package br.com.lermen.ocajp.string;

public class D {
	
	static String q = "qqqq";

	String s = "a";

	//static { s += "b";}

	{
		q = "ss";
		s += "c";
	}
	
	public static void main(String[] args) {
		System.out.println(new D().s);
	}

}
