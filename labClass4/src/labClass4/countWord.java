package labClass4;

import java.util.Scanner;

public class countWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Word :");
		String word=sc.nextLine();
		word=word.trim();
		String[] words=word.split("\\s+");
		int count=words.length;
		System.out.println("Count of word :"+count);
	}

}
