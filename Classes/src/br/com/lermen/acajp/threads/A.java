package br.com.lermen.acajp.threads;

public class A implements Runnable {

	private int id;

	@Override
	public void run() {
		System.out.println(A.class.getName());

		for (int i = 0; i < 10; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
