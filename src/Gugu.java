public class Gugu {

	final int adultCond = 18;

	Gugu() {

		Plus[] plusList = new Plus[10];
		for (int i = 0; i < 10; i++) {
			plusList[i] = new Plus();
			plusList[i].a = i;
		}

//		for (int i = 0; i < plusList.length; i++) {
//			Plus p = plusList[i];
//			System.out.println(p.a);
//
//		}

		int i = 0;
		for (Plus p : plusList) {
			System.out.println(p.a);
			i++;
		}


	}

	public static void main(String[] args) {
		new Gugu();
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
