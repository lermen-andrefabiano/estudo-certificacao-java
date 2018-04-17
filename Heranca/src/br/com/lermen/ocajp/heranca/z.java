package br.com.lermen.ocajp.heranca;

public class z {

	int z;

	z() {
		System.out.println("construtor");
	}

	void z() {
		System.out.println("metodo " + z);
	}

	static public final void main3(String[] args) {
		new z().z();
	}

	static final public void main(String... args) {
		new z().z();
	}

	final static public void main2(String[] args) {
		new z().z();
	}

	final public static void main6(String[] args) {
		new z().z();
	}

	public static final void main4(String... args) {
		new z().z();
	}

	public final static void main5(String... args) {
		new z().z();
	}
}
