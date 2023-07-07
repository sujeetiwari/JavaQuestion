package stringHome;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name="Sujeet Kumar Tiwari";
		String[] a=name.split(" ");
//		String rev=" ";
		for(int i=0;i<a.length;i++) {
			String revWord=a[i];
//			rev=a[i]+rev ;
//		}
//		String s=" ";
//		for(int i=0;i<rev.length();i++) {
		for(int j=revWord.length()-1;j>=0;j--) {
			System.out.print(revWord.charAt(j));
//			s= rev.charAt(i) + s + "  ";
		}
//		System.out.println( s + "   ");
		System.out.print(" ");
		}
	}
		
	}
	


 