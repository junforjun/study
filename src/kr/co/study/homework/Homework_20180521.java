package kr.co.study.homework;

public class Homework_20180521 {
	public static void main(String[] args) {

		int a1 = 0;
		int a2 = 1;
		int a3 = 0;
		int j = 20;

		System.out.println(a1);
		System.out.println(a2);

		while (true) {
			a3 = a1 + a2;
			if (a3 > j) {
				break;
			}
			System.out.println(a3);
			a1 = a2;
			a2 = a3;

		}
	}

}
