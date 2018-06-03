import java.util.Random;

public class A20180501 extends Thread {

	private int id = -1;

	public A20180501(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println(id + "번 쓰레드 동작 중");
		Random r = new Random(System.currentTimeMillis());
		try {
			long s = r.nextInt(3000);
			Thread.sleep(s);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(id + "번 쓰레드 동작 종료");
	}

	public static void main(String[] args) {

		System.out.println("Start main method.");


	for(int i = 0; i < 10; i++) {
		A20180501 test = new A20180501(i);
		test.start();
	}
	System.out.println("End main method.");
}
}
