package labClass2;

import java.util.Scanner;

public class sumOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number :");
		int num=sc.nextInt();
		int sum=0;
		int rem ;
		while(num>0) {
			rem=num % 10 ;
			sum=(rem*rem)+sum;
			num=num/10;
		}
		System.out.println("Sum of the square of all the digits no : "+sum);

	}

}
