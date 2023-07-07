import java.util.*;

public class homePractice {
	public int max(int[] array) {
		int max=0;
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
	public int min(int[] array) {
		int min=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}


	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int [] myarray= {12,45,89,43};
			homePractice m=new homePractice();
			System.out.println("Maximum :" +m.max(myarray));
			System.out.println("Minimum :" +m.min(myarray));
	}
}








//System.out.println("Word:");
//String s=sc.next();
//String reverse="";
//String temp=s;
//for(int i=0;i<s.length();i++) {
//	reverse=s.charAt(i)+reverse;
//}
//System.out.println("Reverse : "+reverse);
//if(temp.equals(reverse)) {
//System.out.println("Palindrome String");
//}
//else {
//System.out.println("Non Palindrome String");
//}