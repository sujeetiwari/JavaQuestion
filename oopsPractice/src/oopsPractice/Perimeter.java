package oopsPractice;

public class Perimeter {
	
	public int perimeter(int s) {
		int square=4*s;
		System.out.println("Perimeter of Square :"+square);
		return square;
	}
	public int perimeter(int l,int b) {
		int rectangle=2*(l+b);
		System.out.println("Perimeter of rectangle :"+rectangle);
		return rectangle;
	}
	public double perimeter(double r) {
		double circle=2*(3.14)*r;
		System.out.println("Perimeter of circle :"+circle);
		return circle;
	}

	public static void main(String[] args) {
		Perimeter per=new Perimeter();
		per.perimeter(12);
		per.perimeter(8,14);
		per.perimeter(4.0);

	}

}
