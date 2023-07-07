package labClass5;

import java.util.Scanner;

public class NoFormatExceptions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 while(true) {
		System.out.println("Value :");
		String a=sc.nextLine();
		
		try {
			int n=Integer.parseInt(a);
			System.out.println("You Entered :"+n);
			break;
		
		}
		catch(NumberFormatException e) {
			System.out.println("Don't Write String value "+e);
		}
		 }
		
					 }
	

}
