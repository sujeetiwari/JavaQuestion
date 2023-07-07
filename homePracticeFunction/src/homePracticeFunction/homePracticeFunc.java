package homePracticeFunction;

public class homePracticeFunc {
	//static method belong to the main class that does not belong to object
//	static void myMethod(String fname,int age) {
//		System.out.println(fname + " Tiwari " + " is " + age);
//	}
//	static int method(int x ,int y) {
//		return x+ y;
//	}
	
//	if else used in function
//	static void checkAge(int age) {
//		if(age>18) {
//			System.out.println("You can vote");
//		}
//		else {
//			System.out.println("You can not vote");
//		}
//	}
//	method overloading
	public static int add(int x,int y) {
		return x+y;
	}
	public static double add1(double d,double e) {
		return  (d+e);
	}
	
	

	public static void main(String[] args) {
//	myMethod("Sujeet",21);
//	myMethod("Risky",22);
//          System.out.println(method(12, 12)); 
//		checkAge(121);
		int num1=add(12,13);
		double num2=add1(2.4,4.6);
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
