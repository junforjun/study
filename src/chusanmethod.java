
public class chusanmethod {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		r.draw();
		c.draw();
	}
}

abstract class Shape {
	int x, y;
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public abstract void draw();

}

class Rectangle extends Shape{
	int width, height;
	public void draw() {
		System.out.println("사각형");
	}
}
class Circle extends Shape {
	int radius;
	public void draw() {
		System.out.println("원");
	}
}