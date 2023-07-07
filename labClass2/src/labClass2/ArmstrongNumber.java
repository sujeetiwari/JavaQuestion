package labClass2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
//		int num=sc.nextInt();
//		int orgNumber;
//		int rem;
//		int result=0;
//		orgNumber=num;
//		while(orgNumber>0) {
//			rem=orgNumber%10;
//			result+=Math.pow(rem,3);
//			orgNumber=orgNumber/10;
//		}
//		if(result==num) {
//			System.out.println(num + " is a Armstrong Number");
//		}
//		else {
//			System.out.println(num +"is not an Armstrong Number");
//		}
		
//		Armstrong Number 1to 1000
		int n;
		int rem;
		int sum=0;	
		for(int i=1;i<=10000;i++) {
			n=i;	
			while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;		
		}
      if(sum==i) {
	System.out.println("Armstrong number:"+i+" ");
  }
  sum=0;
   	}
			}
		
		}
