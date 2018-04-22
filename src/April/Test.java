package April;

public class Test {

	int 멤버변수; // 난 멤버변수라고~

	void test() {

		System.out.println("test() : 여기는 실행이 됨.  ");

		if (true)

			return;

		System.out.println("여기는 실행이 안된다. ");
	}

	int test2() {

		return 0;

	}

	public static void main(String[] args) {

		Test t = new Test();

		System.out.println(" void 함수에서 return; 이란 함수를 종료시키는 의미. 아무것도 리턴하지 않음 즉 함수를 마침. ");

		t.test();

		int tmp = t.test2();
		System.out.println(" return 이란 어떤 값이나 객체를 되돌려준다 라는 의미 . tmp : " + tmp);

	}
}