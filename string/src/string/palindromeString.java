package string;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Word :");
	 String word=sc.nextLine();
	 String rev="";
	 String temp=word;
	 for(int i=0;i<word.length();i++) {
		 rev=word.charAt(i)+rev;
	 }
	 if(rev.equalsIgnoreCase(temp)) {
		 System.out.println( rev + " is a Palindorme String");
	 }
	 else {
		 System.out.println( rev + " is not a Non Palindrome String");
	 }

	}

}
