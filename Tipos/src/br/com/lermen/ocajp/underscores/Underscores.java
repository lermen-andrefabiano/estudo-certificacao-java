package br.com.lermen.ocajp.underscores;

public class Underscores {
	public static void main(String[] args) {
		int w = 1_0_0_0_0_0_________________0;

		System.out.println(w);

		int a = 1_4;
		double b = 1_000_000L;

		Integer aa = 1_4;
		Double dd = 1_000_000.00;

		System.out.println(aa + dd);

		System.out.println(a + b);

		long creditCardNumber = 1234_5678_9012_3456l;
		long socialSecurityNumber = 999_99_9999L;
		long socialSecurityNumber2 = 999_99_9999l;
		float pi = 3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7_fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;

		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(socialSecurityNumber2);
		System.out.println(pi);
		System.out.println(hexBytes);
		System.out.println(hexWords);
		System.out.println(maxLong);
		System.out.println(nybbles);
		System.out.println(bytes);

	}
}
