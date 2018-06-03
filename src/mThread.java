
public class mThread {

	public static void main(String[] args) {
		myThread1 t1 = new myThread1();
		t1.setPriority(10);
		t1.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		/*t1.stop();*/
	}

}

class myThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 30000; i++) {
			System.out.println("myThread1 = " + i);

				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}

		}
	}
}
class myThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 30000; i++) {
			System.out.println("myThread2 = " + i);
		}
	}
}