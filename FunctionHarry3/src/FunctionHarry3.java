import java.util.Scanner;
public class FunctionHarry3 {
 /*static int sum(int a,int b) {
	return a+b;
}
static int sum(int a,int b,int c) {
	return a+b+c;
} 
	//static int sum(int x,int ...arr) {
//		int result =x;
//		this is for compulsory value of int x
//	}
	static int sum(int...arr) {
//		 Available as int[]arr;
		int result=0;
		for(int a:arr) {
			result +=a;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
System.out.println("Welcome to varags tutorial");
System.out.println("The sum of 4 and 5 is :" +sum(4,5));
System.out.println("The sum of 4,7 and 8 is :" +sum(4,7,8));
System.out.println("The sum of 4 ,3,4,5,6,4and 5 is :" +sum(4,3,4,5,6,4,5));
System.out.println("The sum of nothing is :" +sum()); */
	static int sum(int a,int b) {
		return a+b;
	}
	static int mult(int a,int b,int c) {
		return a*b*c;
	}
	static int sum(int...arr) {
		int result=0;
		for(int a:arr) {
			result+=a;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,4,6));
		System.out.println(mult(2,4,1));

	}

}
