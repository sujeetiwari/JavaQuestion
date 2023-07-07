package stringClassWork;

import java.util.Scanner;

public class removeWhiteSpace1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Word with WhiteSpace :");
		String word=sc.nextLine();
		char ch[]=word.toCharArray();
		word=" ";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ')
			{
				word+=ch[i];
			}
		}
		System.out.println("String Without whitespaces :"+word);

	}

}
