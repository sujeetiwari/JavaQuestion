import java.util.Scanner;
public class PracticePrevious {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the number u want to check");
	int sujeet=0;
	int t=sc.nextInt();
	for(int i=1;i<=t;i++) {
		if(t%i==0) {
			sujeet++;		
		
	}
	}
		if(sujeet==2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Non Prime number");
		}
		
	System.out.println("Fibonacci number:");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	for(int i=0;i<n;i++) {
		System.out.println(a);
		int c=a+b;
		a=b;
		b=c;
	}
		
	}
	
	}