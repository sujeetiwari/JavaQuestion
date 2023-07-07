package homeProject7;

import java.util.Scanner;
public class homeProject7 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]a= {1,2,3,5,6};
		int []b= {1,2,3,5,6};
		int i;
		boolean result=true;
		System.out.println("A:");
		for( i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("B:");
		for( i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}	
		System.out.println();
		if(a.length==b.length) {
			System.out.println("Equal length");
		}
		else {
			System.out.println("not equal length");
		}
		for(i=0;i<a.length;i++)
			if(a[i]==b[i]) {
				result= true;
			}
			else {
				result=false;
			}
		if(result==true) {
			System.out.println("equal index");
		}
		else {
			System.out.println("not equal index");
		}
		
	}
}