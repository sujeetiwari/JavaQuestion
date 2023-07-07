package stringHome;

import java.util.Scanner;

public class practice1 {
	

	public static void main(String[] args) {
	String name="sujeet";
	String name2="teejus";
	char[]c1=name2.toCharArray();
	char temp1=0;
	char[]c=name.toCharArray();
	char temp = 0;
	for(int i=0;i<c.length;i++) {
	for(int j=i+1;j<c.length;j++) {
		if(c[j]>c[i]) {
			temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			
		}
	}
			
				
//	System.out.print(c[i]);
	}
		System.out.println();
	
	for(int i=0;i<c1.length;i++) {
		for(int j=i+1;j<c1.length;j++) {
			if(c1[j]<c1[i]) {
				temp=c1[i];
				c1[i]=c1[j];
				c1[j]=temp;
				
			}
		}
//		System.out.print(c1[i]);
	
	}
	System.out.println();
	for(int i=0;i<c.length;i++) {
	if(c1[i]==c[i]) {
		System.out.println("anagram");
	}
	else {
		System.out.println("Non anagram");
	}
	}
	}
}
