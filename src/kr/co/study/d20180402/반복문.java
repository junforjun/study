package kr.co.study.d20180402;
public class 반복문 {

	final int adultCond = 18;

	반복문() {


		구조체[] plusList = new 구조체[10];
		for (int i = 0; i < 10; i++) {
			plusList[i] = new 구조체();
			plusList[i].xx = "" + i;
		}

		// 반복문을 빠져나가는 방법은, break;를 만났을때 , 조건을 만족할때
		for (int i = 0; i < 10; i++) {
			if( i == 5 ) {
				break;
			}
			System.out.println(i);
		}

		// 조건 판정으로 되돌려보내고싶으면 continue;
		// continue문을 만나면 바로 조건판정으로 돌아감
		// 5는 출력되지 않음
		for (int i = 0; i < 10; i++) {
			if( i == 5 ) {
				continue;
			}
			System.out.println(i);
		}

//		for (int i = 0; i < plusList.length; i++) {
//			Plus p = plusList[i];
//			System.out.println(p.a);
//
//		}

		int i = 0;
		for (구조체 p : plusList) {
			System.out.println(p.xx);
			i++;
		}

		int zero = 0;
		// while문은 조건이 거짓일때 종료된다.
		while(zero == 0) {
			System.out.println("무한루프");
			break;
		}

		do {
			System.out.println("한번은 실행됨");
		} while (1==zero);
	}

	public static void main(String[] args) {
		new 반복문();
	}

	private void judgeAge(int age, String nn) {
		if(age >= adultCond){
			System.out.println(nn + "성인입니다.");
		}
	}

	private void judgeAge(int age) {
		judgeAge(age, "");
	}
}
