package kr.co.study.d20180402;

public class 기본변수 {
	public static void main(String[] args) {
		// INT -2^16 - 2^16까지 -2147483648 ~ 2147483647
		int intA = 1;
		System.out.println(intA);

		// LONG -9223372036854775808 ~ 9223372036854775807
		// L붙여서 판단
		long longB = 1L;
		System.out.println(longB);

		// 1.40239846E-45f - 3.40282347E+38f
		// F`로 판단
		float floatC = 1.0F;
		System.out.println(floatC);

		// 4.94065645841246544E-324 - 1.79769313486231570E+308
		// D로 판단
		double doubleD = 1.0D;
		System.out.println(doubleD);

		// char형은 기본 ascii코드로 조합
		// ' 로 둘러쌓음
		char c = 'a';
		System.out.println(c);
		
		// String은 char의 배열형
		String s = "S";
		System.out.println(s);


	}
}
