package April;

public class Fifteen {
	public static void main(String[] args) {

		String b = "https://www.google.co.jp/abcde";
		String[] c = b.split("/");

		for (String s : c) {
			System.out.println(s);
		}


		String d = b.substring(2, 3);
		System.out.println(d);

		String lo = "abcd";

		System.out.println(lo.toUpperCase().toLowerCase());

		https://www.google.co.kr/search?source=hp&ei=7_fSWrjnOoL38QXRn774BA&q=java&oq=java&gs_l=psy-ab.3..0l10.839.1088.0.1232.6.5.0.0.0.0.161.437.0j3.4.0....0...1c.1.64.psy-ab..2.4.661.6..35i39k1.226.UwvgKAidz5M


		String b = "https://www.google.co.kr/search?source=hp&ei=7_fSWrjnOoL38QXRn774BA&q=java&oq=java";
		String d = b.substring(24, 82);
		System.out.println(d);
	}
}
