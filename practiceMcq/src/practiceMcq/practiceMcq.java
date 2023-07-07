package practiceMcq;
import java.util.*;
public class practiceMcq {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	System.out.println("number :");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		
		for(int i=2;i<=num;i++) {
			c=a+b;
			
			System.out.println("c :"+c);
			a=b;
			b=c;
		}
		
			
		
	}
		
				}

		
	


