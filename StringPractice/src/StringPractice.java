import java.util.Scanner;
public class StringPractice {

	public static void main(String[] args) {
	   String name="Sujeet tiwari";
	   System.out.println(name);
	   int value=name.length();
	   System.out.println(value);
	   String lstring=name.toLowerCase();
	   System.out.println(lstring);
	   System.out.println(name.toUpperCase());
	   String nontrimmed="    hello sujeet    ";
	   System.out.println(nontrimmed);
	   String s="sujeet loves kumkum";
	   System.out.println(s.charAt(0));
//	   System.out.println(nontrimmed.trim());
//	   System.out.println(name.substring(3));
//	   System.out.println(name.substring(2, 9));
//	   System.out.println(name.replace('S','m'));
//	   System.out.println(name.startsWith("Suj"));
//	   System.out.println(name.endsWith("SUje"));
//	   System.out.println(name.charAt(0));
	   System.out.println(name.indexOf("t"));
	   System.out.println(name.lastIndexOf("r"));
	   System.out.println(name.equals("Sujeet tiwarii"));
	   System.out.println(name.equalsIgnoreCase("sujeeut tiwari"));
	}
	 
	 
	}	

