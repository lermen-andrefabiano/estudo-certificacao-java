package br.com.lermen.ocajp.threads;

public class T {

	public static void main(String[] args) {

		A a = new A();
		a.setId(1);
		Thread t1 = new Thread(a);
		t1.start();

		A b = new A();
		b.setId(2);
		Thread t2 = new Thread(b);	
		t2.start();
		
		A c = new A(){
			private void sysout() {

			}
			
			@Override
			public void setId(int id) {
				// TODO Auto-generated method stub
				super.setId(id);
			}
		};

	}

}
