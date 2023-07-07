package homePractice4;

import java.util.Scanner;

public class homePractice4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int num=20;
		int temp;
		for(int i=1;i<=num;i++) {
			temp=0;
			for (int j=2;j<=i/2;j++) {
				if(i%j==0) {
					temp++;
					break;
				}
			}
				if(temp==0) {
					System.out.println("Prime no :"+i+" ");
			}
		}
		
		
		
		
		
		
		
		
//		int n;
//		int rem;
//		int sum=0;	
//		for(int i=1;i<=10000;i++) {
//			n=i;	
//			while(n>0) {
//			rem=n%10;
//			sum=sum+(rem*rem*rem);
//			n=n/10;		
//		}
//      if(sum==i) {
//	System.out.println("Armstrong number:"+i+" ");
//  }
//  sum=0;
//    	}

}
}