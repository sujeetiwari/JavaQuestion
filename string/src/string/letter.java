package string;

public class letter {

	public static void main(String[] args) {
		String a="sujeet tiwari";
		String output=a.substring(0,1).toUpperCase()+a.substring(1);
			System.out.println(output);
				 String s1="java program";
				 for(int i=0;i<s1.length();i++) {
					 if(i==0) {
						 char c=s1.charAt(i);
						 String ch=" "+c;
						 System.out.print(ch.toUpperCase());
						 continue;
					 }
					 if(s1.charAt(i)==' ') {
						 char c=s1.charAt(i+1);
						 String ch=" "+c;
						 System.out.print(ch.toUpperCase());
						 i++;
						 continue;
					 }
					 System.out.print(s1.charAt(i));
				 }
		}

	}

//String name="mY namE iS a SujEEt";
//String []words=name.split(" ");
//
//for(int i=0;i<words.length;i++) {
//char c=words[i].charAt(0);
//String c1=String.valueOf(c).toUpperCase();
//String sb=words[i].substring(1).toLowerCase();
//System.out.print(c1+sb+" ");