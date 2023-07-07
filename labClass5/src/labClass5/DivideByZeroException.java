package labClass5;

import java.util.Scanner;

public class DivideByZeroException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();

		try {
						int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Don't divide by zero");
		}

	}

}
