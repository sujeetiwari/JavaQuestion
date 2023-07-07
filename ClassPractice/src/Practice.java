class Employee{
	int salary;
	String name;
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
}
class Celphone{
	public void ring() {
		System.out.println("RInging.....");
	}
	public void vibrat() {
		System.out.println("Vibrating....");
	}
}
class Square{
	int side;
	public int area() {
		return side *side;
	}
	public int perimeter() {
		return 4*side;
	}
}
class Tommy{
	public void hit() {
		System.out.println("Hitting the enemy");
	}
	public void run() {
		System.out.println("Running the enemy");
	}
	public void fire() {
		System.out.println("Fire the enemy");
	}
}
public class Practice {
 
	public static void main(String[] args) {
//		Problem 1
		Employee harry=new Employee();
		harry.setName("sujeet");
		harry.salary=233;
		System.out.println(harry.getSalary());
		System.out.println(harry.getName());
//		Problem 2
		Celphone redmi=new Celphone();
		redmi.vibrat();
		redmi.ring();
//		Problem 3
		Square sq=new Square();
		sq.side=6;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
//		Problem 4
		Tommy s=new Tommy();
		s.hit();
		s.run();
		s.fire();
		
	}

}
