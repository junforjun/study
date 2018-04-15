package kr.co.study.d20180402;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Str {
	public static void main(String[] args) {
		String  b = "1/2/3/4/5";
		String[] c = b.split("/");

		for (String s : c) {
			System.out.println(s);
		}

		String d = b.substring(2, 2);
		System.out.println(d);

		String lo = "abcd";


		String q = "aa";

		String w = "aa";


		int aa= 5;
		int bb = 6;

		Date qqq = new Date();
		System.out.println(qqq);

		SimpleDateFormat sm = new SimpleDateFormat("YYYY-MM-dd HHmmss.ssssss");

//		System.out.println(sm.format(qqq));
		
		Calendar car = Calendar.getInstance();
		
		car.add(Calendar.YEAR, 1);
		
		System.out.println(sm.format(car.getTime()));
		
		LocalDateTime lodt = LocalDateTime.now();
		
		



	}
}
