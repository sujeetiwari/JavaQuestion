package string;

import java.util.Scanner;

public class particularWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="Java Java is a Java program java";
		String word="Java";
		String split[]=a.split(" ");
		int count=0;
		for( int i=0;i<split.length;i++) {
		
			if(word.equalsIgnoreCase(split[i])) 
				count++;
			
			
		}
		
		System.out.println("Count of java String :"+count);
		

	}

}
