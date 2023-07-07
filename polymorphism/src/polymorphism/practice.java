package polymorphism;

class vehicle{
	void run() {
		System.out.println("bike is running");
	}
	
}
class Bike extends vehicle{
void run() {
		System.out.println("car");
	}
}
class Car extends vehicle{
//	void run() {
//		System.out.println("Maruti Car");
//}
}
public class practice {

	public static void main(String[] args) {
	vehicle b=new Car();
	b.run();
	}

}
