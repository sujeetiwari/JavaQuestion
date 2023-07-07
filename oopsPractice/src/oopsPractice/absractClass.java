package oopsPractice;
abstract class Shape{
	abstract void area(double a);
}
 class Circle extends Shape{
	void area(double r) {
		double area=3.14*r*r;
		System.out.println("Area of circle :"+area);
	}
}
 class Square extends Shape{
	void area(double a) {
		double area=a*a;
		System.out.println("Area of square :"+area);
	}
	
}
 class Triangle extends Shape{
	void area(double b) {
		double h=12;
		double area=0.5*b*h;
		System.out.println("Area of Triangle :"+ area);
	}
	
}
public class absractClass {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.area(12);
		Square s=new Square();
		s.area(3);
		
	}

}
