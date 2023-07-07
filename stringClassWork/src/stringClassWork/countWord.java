package stringClassWork;

import java.util.Scanner;

public class countWord {
static int wordCount(String s) {
	int count=0;
	char ch[]=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		ch[i]=s.charAt(i);
		if((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')||((ch[0]!=' ')&&(i==0))){
			count++;
		}
	}
	return count;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Word:");
		String word=sc.nextLine();
	System.out.println("Count Words :"+wordCount(word));
		
	}
}

	

