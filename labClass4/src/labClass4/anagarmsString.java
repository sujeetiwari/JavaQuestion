package labClass4;

import java.util.Arrays;
import java.util.Scanner;

public class anagarmsString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String 1 :");
		String s1=sc.nextLine();
		System.out.println("String 2 :");
		String s2=sc.nextLine();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    boolean result=Arrays.equals(ch1, ch2);
	    	if(result) {
	    		System.out.println( s1 + " and " + s2 + " is an Anagram.");
	    		
	    	}
	    	else {
	    		
	    		System.out.println( s1 + " and " + s2 +" is not an Anagram. ");
	    	}
	  
	}

}
