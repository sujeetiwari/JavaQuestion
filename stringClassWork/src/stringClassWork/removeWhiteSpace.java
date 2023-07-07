package stringClassWork;

import java.util.Scanner;

public class removeWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Character :");
		String space=sc.nextLine();
		String remove="";
		for(int i=0;i<space.length();i++) {
			char ch=space.charAt(i);
			if(!Character.isWhitespace(ch)) {
				remove+=ch;
			}
		}
		System.out.println("Remove Space :"+remove);





//System.out.println("Word :");
//String word=sc.nextLine();
//word=word.replaceAll("\\s", "");
//System.out.println(word);

	}

}
