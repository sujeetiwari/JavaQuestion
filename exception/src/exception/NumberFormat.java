package exception;

import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 while(true) {
			 System.out.println("Enter a no :");
			 String no = sc.nextLine();
			 
			 try {
				int n =Integer.parseInt(no);
				 System.out.println("You entered :"+n);
				 break;
			 }
			 catch(Exception e) {
				 System.out.println("Exception Occured");
			 }
		 }

	}

}
