package labClassPractice;
import java.util.*;
public class labClassPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		Post Decrement
		System.out.println("a:");
		int a=sc.nextInt();
		int post=a--;
		System.out.println("Post Decrement : "+post);
		
//      Pre Decrement		
		System.out.println("b:");
		int b=sc.nextInt();
		int pre=--b;
		System.out.println("Pre Decrement :" +pre);

	}

}
