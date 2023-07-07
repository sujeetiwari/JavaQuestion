class Circle{
	public int radius;
	Circle(){
		System.out.println("I am non param of circle");
	}
	Circle(int r){
		System.out.println("I am circle parameterized constructor");
		radius=r;
	}
	public double area() {
		return Math.PI*radius*radius;
		
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int Radius) {
		radius =Radius;
	}
}
class Cylinder extends Circle{
	public int height;
	Cylinder(int r,int h){
		super(r);
		System.out.println("I am cylinder parameterized constructor");
		height=h;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int Height) {
		height=Height;
	}
	public double volume() {
		return Math.PI*radius*radius*height;
	}
}
public class InheritancePractice {

	public static void main(String[] args) {
		
//        Circle obj=new Circle();
//        obj.setRadius(8);
//        System.out.println(obj.getRadius());
//        obj.area();
//        System.out.println(obj.area());
        Cylinder obj1=new Cylinder(12,45);
        obj1.setRadius(7);
        obj1.setHeight(9);
        System.out.println(obj1.getRadius());
        System.out.println(obj1.getHeight());
        	obj1.volume();	
        System.out.println(obj1.volume());
        
	}

}
