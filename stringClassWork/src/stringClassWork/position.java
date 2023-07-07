package stringClassWork;

import java.util.Scanner;

public class position {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String:");
		String a=sc.nextLine(); 
		String f="";
		if(a.length()<=4) {
			f=a;
		}
		else {
			for(int i=0;i<a.length()-4;i++) {
				f+="X";
			}
			f+=a.substring(a.length()-4);
		}
		System.out.println("Change String :"+f);

	}

}
