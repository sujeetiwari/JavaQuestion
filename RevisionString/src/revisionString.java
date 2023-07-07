import java.util.Scanner;
public class revisionString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Name:");
//		String name=sc.next();//This is for only name
//		String name=sc.nextLine();// this is for full name
//		System.out.println("Your name is :"+name);
		//Concatentation-merge two name
//		String firstName="SuJeet";
//		String secondName="Tiwari";
//		String fullName=firstName +" "+ secondName ;// " this is for space in name
//		System.out.println(fullName);
//			System.out.println(fullName.length());
//			//charAt
//		for(int i=0;i<fullName.length();i++) {
//		System.out.println(fullName.charAt(i));	
//		}
		//compare
//		String name1="Tony";
//		String name2="Tony1";
////		if(name1==name2) { this is true but it's not true in interview
//		if(name1.compareTo(name2)==0) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("Strings are not equal");
//		}
//		//Substring-means which word we want we can print with the help of substring
//		String sentence="My name is Sujeet";
////		substring(beg index,end index)
//		System.out.println(sentence.substring(2, 7));
//		
		// String builder
		StringBuilder sb=new StringBuilder("hello");
		for(int i=0;i<sb.length()/2;i++) {
			int front=i;
			int back=sb.length()-1-i;//5-1-0=4
			char  frontChar=sb.charAt(front);
			char backChar=sb.charAt(back);
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
//		sb.append(" is");
//		sb.append(" a");
//		sb.append(" iron man");
		
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb.insert(2, 'n'));
		System.out.println(sb.delete(2, 3));
//		System.out.println(sb.reverse());
	}
	
}

