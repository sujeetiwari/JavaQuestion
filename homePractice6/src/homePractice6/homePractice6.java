package homePractice6;

import java.util.Scanner;

public class homePractice6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=2;
		int temp=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				temp++;
			}
		}
		if(temp==2) {
			System.out.println("Prime no");
		}
		else {
			System.out.println("non prime ");
		}
	}	
}			
					
				
				
			
			
		
	
			
		


