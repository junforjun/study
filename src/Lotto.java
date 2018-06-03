import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] f = getLotto();
		for (int i : f) {
			System.out.println(i);
		}
	}

	public static int[] getLotto() {
		int[] result = new int[6];
		
		for(int i = 0; i < result.length; i++) {
			Random ran = new Random();
			int num= ran.nextInt(46);
			boolean isSame = false;
			
			for (int n : result) {
				if (num == n) {
					isSame = true;
				}
			}
			if (!isSame) {
				result[i] = num;
			} else {
				i = i-1;
			}
			
		}

		return result;

	}

}
