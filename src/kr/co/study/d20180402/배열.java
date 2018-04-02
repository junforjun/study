package kr.co.study.d20180402;

public class 배열 {
	public static void main(String[] args) {

		// 지정된 갯수만큼 배열을 만듬
		String[] s = new String[5];

		// 배열의 총 개수 length
		System.out.println(s.length);

		s[1] = "1";

		for (int i = 0; i < s.length; i++) {
			String ss = s[i];
			System.out.println(ss);
		}
	}

}
