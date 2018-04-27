package kr.co.study.d20180402;

public class Util {

	public static String getUrl(String url) {
		String[] s = url.split("/");
		return s[s.length-1];
	}



}
