package string;

import java.util.Scanner;

public class compareTwoString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String 1:");
		String s1=sc.nextLine();
		System.out.println("String 2 :");
		String s2= sc.nextLine();
//		String s2=new String("Sujit");
		if(s1==s2) {
			System.out.println("memory location are same");
		}
		else {
			System.out.println("not same memory location");
		}
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}

	}

}

