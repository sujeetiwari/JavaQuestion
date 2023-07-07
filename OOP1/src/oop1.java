import java.util.Scanner;

public class oop1 {
	
static int greet() {
	try {
		int a=23;
		int b=0;
		int c=a/b;
		return c;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("this is finally block");
	}
	return 0;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int k=greet();
		System.out.println(k);
		int a=5;
		int c=9;
		while(true) {
			try {
				System.out.println(a/c);
			}
			catch(Exception e) {
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("this is finally block ....");
			}
		}
	}
}
