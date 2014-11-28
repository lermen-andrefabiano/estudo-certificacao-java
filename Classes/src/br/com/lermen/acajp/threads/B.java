package br.com.lermen.acajp.threads;

public class B implements Runnable {

	@Override
	public void run() {
		System.out.println(B.class.getName());

	}

}
