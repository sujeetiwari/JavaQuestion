package string;

import java.util.Scanner;

public class findCharacterCount {
	
	static int findOccurenceCharacter(String s,char ch) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Word:");
		String word=sc.nextLine();
		System.out.println("Searching Character :");
		char ch=sc.next().charAt(0);
		int count=findOccurenceCharacter(word,ch);
		System.out.println("Count of " + ch + " : "+count + " times");
	
		

	}

}

