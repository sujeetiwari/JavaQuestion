package exception;

import java.util.Scanner;

public class ThrowsException {
	
	
		

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		if(n<1) {
			ArithmeticException e=new ArithmeticException("Dont write 1");
			throw e;
		}
		int facts=1;
		
			int i=1;
			while(i<=n) { 
				facts*=i;
				i++;
			}
			System.out.println( " "+facts);
			
			
		}
	}
			
		

