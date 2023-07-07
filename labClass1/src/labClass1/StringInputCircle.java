package labClass1;

import java.util.Scanner;

public class StringInputCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input;
		do {
			System.out.print("Enter the radius of the circle :");
			double radius=sc.nextDouble();
			double area=Math.PI*radius*radius;
			System.out.println("The area of the circle is :" + area);
			
			System.out.println("Do you want to calculate the area of another circle? (Yes/No):");
			input=sc.next().toLowerCase();
		}
		while(input.startsWith("yes"));
		System.out.println("Thank you for using the Circle Area Calculator.");



	}

}
