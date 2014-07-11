package br.com.estuco.oca;

public class B implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello");
	}

	public void start() {
		System.out.println("start");
	}

	public static void main(String[] args) {
		new Thread(new B()).start();
	}

}
