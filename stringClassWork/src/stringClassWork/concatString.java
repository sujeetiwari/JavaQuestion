package stringClassWork;

import java.util.Scanner;

public class concatString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("String 1:");
//		String[] a=new String[1];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextLine();
//		}
//		System.out.println("String 2:");
//		String[] b=new String[1];
//		for(int i=0;i<b.length;i++) {
//			b[i]=sc.nextLine();
//		}
//		System.out.println("String 3:");
//		String[] c=new String[1];
//		for(int i=0;i<c.length;i++) {
//			c[i]=sc.nextLine();
//		}
		String a[]= {"Sujeet"," ","tiwari"};
		String b[]= {"ayus"," ","teuhe"};
		String c[]=null;
		String result1=concatenateStrings(a);
		String result2=concatenateStrings(b);
		String result3=concatenateStrings(c);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	
	}

	public static String concatenateStrings(String[] strings) {
		if(strings==null) {
			
		return "";
	}
		String result="";
		for(String str:strings) {
			if(str!=null) {
			result+=str;
		}
		}
		return result;

	}

} 
