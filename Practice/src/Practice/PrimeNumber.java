package Practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=20;
		int temp1;
		for(int i=1;i<=num1;i++) {
			temp1=0;
			for (int j=2;j<=i/2;j++) {
				if(i%j==0) {
					temp1++;
					break;
				}
			}
				if(temp1==0) {
					System.out.println("Prime no :"+i+" ");
			}

		}
	}
}	
//		System.out.println("Number :");
//		int num=sc.nextInt();
//		int temp=0;
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				temp++;
//			}
//		}
//		if(temp==2) {
//			System.out.println("Prime Number");
//		}
//		else {
//			System.out.println("Non Prime Number");
//		}
		
	



