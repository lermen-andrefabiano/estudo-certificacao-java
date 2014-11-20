package be.com.estudo.oca.fin;

import be.com.estudo.oca.fin.Sequence;

public class Sequence {
	
	Sequence() {
		System.out.print("c ");
	}

	{
		System.out.print("y ");
	}

	public static void main(String[] args) {
		new Sequence().go();
	}

	void go() {
		System.out.print("g ");
	}

	static {
		System.out.print("x ");
	}
	
	// saída x y c g 
}
