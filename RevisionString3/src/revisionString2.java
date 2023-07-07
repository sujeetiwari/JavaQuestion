import java.util.Scanner;

public class revisionString2 {
	
	
	public static void main(String[] args) {
		//Palindrome
//		Scanner sc=new Scanner(System.in);
////		System.out.println("String :");
//		String s="radar",reverseStr="";
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			reverseStr=reverseStr+s.charAt(i);
//		}
//		if(s.toLowerCase().equals(reverseStr.toLowerCase())) {
//			System.out.println(s +" is a palindrome String.");
//		}
//		else {
//			System.out.println(s + " is not a palindrome String");
//		}
//		
//		
////Reverse string
//		String string="Sujeet Tiwari";
//		String reverse=new StringBuffer(string).reverse().toString();
//		System.out.println("Reverse String : " + reverse);
////		2nd way to Reverse String
//		String k="Risky Tiwari";
//		char[]c=k.toCharArray();
//		for(int i=c.length-1;i>=0;i--) {
//			System.out.println( c[i] +" ");
//			
//		}
//		//Anagram
//		String str1="javaa" ;
//		String str2="avasj";
//		System.out.println(anagramCheck(str1,str2));
//	}
//		 public static boolean anagramCheck(String str1, String str2) {
//			char[]charString=str1.toCharArray();
//			StringBuilder sb =new StringBuilder(str2);
//			for(char c:charString) {
//				int index=sb.indexOf(String.valueOf(c));
//				if(index!=-1) {
//					sb.deleteCharAt(index);
//				}
//				else {
//					return false;
//				}
//			}
//				return sb.length()==0;
//			}
//			
//			
//		 
//		 
//}
//Paranthesis
	String a="java";
	String b="avah";
	System.out.println(anagramCheck(a,b));
	}
	public static boolean anagramCheck(String a,String b) {
	char[] c=a.toCharArray();
	StringBuilder sb=new StringBuilder(b);
	for(char s:c) {
		int index=sb.indexOf(String.valueOf(s));
		if(index!=-1) {
			sb.deleteCharAt(index);
		}
			else {
				return false;
			}
		}
		return sb.length()==0;
}

	
	
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}