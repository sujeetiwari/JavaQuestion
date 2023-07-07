package string;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Original String :");
		String s=sc.nextLine();
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println( "Reverse a String :"+rev);
		
		}
	
		
					
	}


