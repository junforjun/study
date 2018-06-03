package kr.co.study.d20180402;

public class Ex {

	public static void main(String[] args) {
/*		try {
			Ko k = null;
			k.doPrint();
		} catch (NullPointerException e ) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}
*/

		try {
			sunday();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		/* try {

		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}*/

		System.out.println("*****************************");
	}
	public static void abc() {
		try {
			Ko k = null;
			k.doPrint();
		} catch (NullPointerException e ) {
			System.out.println(e.getMessage());
			throw e;
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}

	}

	public static void sunday() throws Exception {
		Ko k = null;
		k.doPrint();
	}

}
