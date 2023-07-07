package duplicateBracketstacks;
import java.util.Scanner;
import java.util.Stack;
//import java.io.*;

public class duplicateBracketStacks {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of string:");
		String str=sc.nextLine();
  Stack<Character>st=new Stack<>();
  for(int i=0;i<str.length();i++) {
	  char ch=str.charAt(i);
	  if(ch==')') {
		  if(st.peek()=='(') {
			  System.out.println(true);
			  return;
		  }else {
			  while(st.peek()!='(') {
				  st.pop();
			  }
			  st.pop();
		  }
		  
	  }
	  else {
		  st.push(ch);
	  }
  }
  System.out.println(false);
	}

}
