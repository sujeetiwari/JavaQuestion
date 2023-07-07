import java.util.Scanner;

class Vehicle{
	String brand;
	int model;
	int year;
	Vehicle(String brand,int model,int year){
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	void drive() {
		if(year>2010) {
		System.out.println( "You can drive");
	}
		else {
			System.out.println("You can't drive");
		}
	}
}
class Car extends Vehicle{
	String color;
	Car(String brand,int model,int year,String color){
		super(brand,model,year);
		this.color=color;
	}
	void honk(){
		System.out.println("honk....");
		
	}
//	void display() {
//		System.out.println("Brand :"+brand);
//		System.out.println("Model :"+model);
//		System.out.println("Year :"+year);
//	System.out.println("Color :"+color);
//	}
	
}
public class lmsExercise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Brand :");
		String name=sc.nextLine();
		System.out.println("Model :");
		int model=sc.nextInt();
		System.out.println("Year :");
		int year=sc.nextInt();
		sc.nextLine();
		System.out.println("Color :");
		
		String color=sc.nextLine();
		
		Car c=new Car(name,model,year,color);
//		c.display();
		c.honk();
		c.drive();
	}

}
