package stringClassWork;

import java.util.Scanner;

public class duplicateCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Character :");
		String word=sc.nextLine();
		char []ch=word.toCharArray();
		System.out.println("Duplicate Character :");
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
				}
			}
			
		}
		
		
		
	}
}