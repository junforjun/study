package kr.co.study.d20180402;

public class Gugu {
	public static void main(String[] args) {
		boolean a = false;
		for (int i = 1; i < 10; i++) {
			if (!a) {
				for (int j = 2; j  <  6; j++) {
					System.out.print(j + " x " + i + " = " + j * i  + "\t" );
					if(j == 5) {
						System.out.println();
					}
				}
			}
			if (a) {
				for (int j = 6; j < 10; j++) {
					System.out.print(j + " x " + i + " = " + j * i + "\t");
					if (j == 9) {
						System.out.println();
					}
				}
			}
			if(!a && i == 9) {
				a = true;
				i = 0;
			} else if(a && i == 9) {
				break;
			}
		}

	}
}
