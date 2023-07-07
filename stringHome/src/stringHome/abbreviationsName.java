package stringHome;

import java.util.Scanner;

public class abbreviationsName {

	public static void main(String[] args) {
		// Sk Tiwari
		Scanner sc=new Scanner(System.in);
		System.out.println("Name :");
		String name=sc.nextLine();
		String str="";
		System.out.println("Abbreviate Name: ");
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch!=' ') {
				str=str+ch;
			}
			else {
				System.out.print(Character.toUpperCase(str.charAt(0))+".");
				str="";
			}
		}
		String str1="";
		for(int j=0;j<str.length();j++) {
			if(j==0) {
				str1=str1+Character.toUpperCase(str.charAt(0));
				
			}else {
				str1=str1+Character.toLowerCase(str.charAt(j));
			}
			
		}
		System.out.println(str1);
	}
}
