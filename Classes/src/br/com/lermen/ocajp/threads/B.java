package br.com.lermen.ocajp.threads;

public class B implements Runnable {

	@Override
	public void run() {
		System.out.println(B.class.getName());

	}

}
