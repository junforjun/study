package April;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fifteen2 {
	public static void main(String[] args) {
/*	String a = "abcd";
	String b = "abcd";

	System.out.println(a.equals("abcd"));

	int q = 123;
	int w = 123;
	System.out.println(q != w);
	*/
	Date d = new Date();
	System.out.println(d);

	SimpleDateFormat sm = new SimpleDateFormat("YYYY-MM-dd");

	System.out.println(sm.format(d));

	Calendar c = Calendar.getInstance();
	c.add(Calendar.YEAR, 1);

	System.out.println(sm.format(c.getTime()));

	LocalDateTime lo = new LocalDateTime();
	}
}
