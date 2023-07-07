import java.util.Scanner;
public class LoopPracticePep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number :");
//		//digit of a number
//	int n=sc.nextInt();
//	int dig=0;
//	int temp=n;
//	while(temp!=0) {
//		temp=temp/10;
//		dig++;
//	}
//	System.out.println(dig);
//	int div=(int)Math.pow(10, dig-1);
//	while(n!=0) {
//		int q=n/div;
//		System.out.println(q);
//		n=n%div;
//		div=div/10;
//	}
	//fiboaccai
//	int n1=5;
//		System.out.println("enter the value of n:");
//		int n=sc.nextInt();
//	int a=0;
//	int b=1;
//	for(int i=0;i<n;i++) {
//		System.out.println(a);
//	int c=a+b;
//	a=b;
//	b=c;
//	}
		
//		int n=5;
//		for(int i=n;i>=1;i--) {
//			for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("\t *");
//			}
//			System.out.println();
//		}
			//prime factorization
			System.out.println("Enter a number:");
			int n=sc.nextInt();
			for(int div=2;div*div<=n;div++) {
				while(n%div==0) {
					n=n/div;
					System.out.println(div);
				}
			}
			
			if(n!=1) {
				System.out.print(n);
			} 
	
}
	
}

