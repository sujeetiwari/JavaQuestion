package labClass1;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int remainder=0;
		int sum=0;
		int temp;
		temp=num;
		while(num>0) {
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}

	}

}
