package string;

import java.util.Scanner;

public class reverseString2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Original Word :");
		String str=sc.nextLine();
		String [] word=str.split(" ");
		String rev="";
		
		for(int i=0;i<word.length;i++) {
			String w=word[i];
			String revWord="";
			for(int j=w.length()-1;j>=0;j--) {
				revWord=revWord+w.charAt(j);
			}
			rev=rev+revWord+" ";
		}
		System.out.println("Reverse String of Each word : " +rev);

	}

}
	