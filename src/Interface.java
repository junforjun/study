
public class Interface {

	public static void main(String[] args) {

		Tachi t = new Tachi();
		Hammer h = new Hammer();

		t.counter();
		t.kabutowari();
		h.bigbang();
		h.charge();

	}
}

interface Control {
	public void counter();
	public void kabutowari();

}

interface Control2 {
	public void bigbang();
	public void charge();
}


class Tachi implements Control{
	public void counter() {
		System.out.println("간파베기");
		}
	public void kabutowari() {
		System.out.println("투구깨기");
		}
}

class Hammer implements Control2{
	public void bigbang() {
		System.out.println("빅뱅 쿵쿵따");
		}
	public void charge() {
		System.out.println("차지어택");
		}
}