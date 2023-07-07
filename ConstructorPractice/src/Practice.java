class Cylinder{
private	float radius;
	private float height;
	public Cylinder(float Radius,float Height) {  // constructor
		radius=Radius;
		height=Height;
	}
	public void setRadius(float r ) {
		radius=r;
	}
	public float getRadius() {
		return radius;
	}
	public void setHeight(float h) {
		height=h;
	}
	public float getHeight() {
		return height;
	}
	public double volume() {
		return Math.PI*radius*radius*height;
		
	}
	public double surfacearea() {
		return 2*3.14*radius*radius+2*3.14*radius*height;
	}
}
public class Practice {

	public static void main(String[] args) {
		Cylinder shape=new Cylinder(23,6);
//		shape.setRadius(6);
//		shape.setHeight(7);
		System.out.println(shape.getRadius());
		System.out.println(shape.getHeight());
		shape.volume();
        shape.surfacearea(); 
		System.out.println(shape.volume());
		System.out.println(shape.surfacearea());
	}

}
