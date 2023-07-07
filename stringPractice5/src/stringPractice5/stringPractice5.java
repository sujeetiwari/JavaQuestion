package stringPractice5;
import java.util.Scanner;
public class stringPractice5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s="SUJEET TIWARI";
	System.out.println(s.toLowerCase());
	System.out.println(s.length());
	String txt="Life is going to hell";
	System.out.println(txt.indexOf("fe"));
String firstName="Ayush";
String lastName="Thakur";
System.out.println(firstName + " " + lastName);
System.out.println(firstName.concat(lastName));
System.out.println(s.substring(0,5));
System.out.println(s.replace("SUJEET", "Risky"));
String k="   sujeet tiwari     ";
System.out.println(k.trim());
System.out.println(s.startsWith("S"));
System.out.println(s.endsWith("t"));
// Strings in Java  are immutable that means we can't do delete and add
StringBuilder sb=new StringBuilder("Tony");
System.out.println(sb);
System.out.println(sb.charAt(0));
//set is used for replace a character
sb.setCharAt(0, 'R');
System.out.println(sb);
sb.insert(2, "n");
System.out.println(sb);
System.out.println(sb.delete(2,4));
sb.append("T");
sb.append("i");
System.out.println(sb);
System.out.println(sb.length());
//Reverse String
StringBuilder r=new StringBuilder("sujeet");
for(int i=0;i<r.length()/2;i++) {
	int front=i;
	int back=r.length()-1-i;
	char frontChar=r.charAt(front);
	char backChar=r.charAt(back);
	r.setCharAt(front, backChar);
	r.setCharAt(back, frontChar);
}
System.out.println(r);
	}

}
