interface Drawable{
	void draw();
}
interface showable{
	void show();
}
class Rectangle implements Drawable,showable{
	public void draw() {
		System.out.println("Draw Rectangle");
	}
	public void show() {
		System.out.println("Show Rectangle");
	}
}
class Circle implements Drawable,showable{
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void show() {
		System.out.println("Show Circle");
	}
}
public class practice {

	public static void main(String[] args) {
		Rectangle d=new Rectangle();
		d.draw();
		d.show();
		Circle d1=new Circle();
		d1.draw();
		d1.show();

	}

}
