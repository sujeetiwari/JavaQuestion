package functionExercise;

final class Bike{
	static  final int data;
	Bike(int data){
		this.data=data;
	}
	 
	  void run() {
		
		System.out.println("run"+data);
	}
 }
 

public class exercise {
	
	
	public static void main(String[] args) {
	Bike b=new Bike(12) {
		b.run();
	}

	

	}

}
