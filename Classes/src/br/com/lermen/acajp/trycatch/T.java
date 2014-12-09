package br.com.lermen.acajp.trycatch;

public final class T {
	
	private final int num = 10;
	
	public static void main(String[] args) {
		
		T t = new T();
		
		//new T().metodoTryCatch();
		
		//t.num = 11; // ERRO
		
		System.out.println(t.num);
		
	}
	

	public void metodoTryCatch() {

		try {

			Class clazz = Class.forName("java.lang.String");

			Object o = clazz.newInstance();
			System.out.println(o.getClass());

		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
