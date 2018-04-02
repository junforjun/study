package kr.co.study.d20180402;

import java.sql.Date;

public class 메소드 {
		public int a = 1;
		private int b = 2;

		public static int c = 3;

		public void print() {
			printx();
		}

		// static메소드는 아무 클래스에서 인스턴스 생성없이 호출가능
		public static int printx() {
			return 1;
		}

		// 메소드 오버로딩(동일메소드이름으로 인수 갯수/형만 변경)
		public static Date getDate(int y, int m, int d) {
			return new Date(y, m, d);
		}
		
		// 메소드 오버로딩으로 getDate를 호출
		public static Date getDate(int y, int m) {
			return getDate(y, m, 1);
		}
		// 메소드 오버로딩으로 getDate를 호출
		public static Date getDate(int y) {
			return getDate(y, 1, 1);
		}
		
		private void noAccess() {
			//이메소드는 외부에서 접근이 불가능
		}
}
