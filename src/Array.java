import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String [] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("a");

		int bb = (int) list.get(0);
		String cc = (String) list.get(1);

		System.out.println(bb);
		System.out.println(cc);

	}
}
