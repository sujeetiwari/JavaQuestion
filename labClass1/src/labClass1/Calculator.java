package labClass1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String input;
		do {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Select an operation :");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");	
		int operation=sc.nextInt();	
		System.out.println("Enter the first number :");
		double num1=sc.nextDouble();
		System.out.println("Enter the second number :");
		double num2=sc.nextDouble();
		double result=0;
		switch(operation) {
		case 1:
			result=num1+num2;
			System.out.println("Result of Addition Operation  : " +result);
			break;		
		case 2:
			result=num1-num2;
			System.out.println("Result of Subtraction Operation : " +result);
			break;		
		case 3:
			result=num1*num2;
			System.out.println("Result of Multiplication Operation : " +result);
			break;	
		case 4:
			if(num2!=0) {
			result=num1/num2;
			System.out.println("Result of Division Operation : " +result);
			}else {
				System.out.println("Error Division by zero is not allowed."); }
			break;
			default:
			System.out.println("Invalid operation.");
			break;   
		}
		System.out.println("Do you want to continue operation ? (Yes/No) :");
		input=sc.next().toLowerCase();
		}
		while(input.startsWith("yes"));
		System.out.println("Thankyou for using the calculator operation");

	}

}
