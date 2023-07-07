import java.util.Scanner;
public class revisionLoop {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
//		System.out.println("Enter the value of t:");
//		 int t=in.nextInt();
//	        for(int i=0;i<t;i++){
//	            int a = in.nextInt();
//	            int b = in.nextInt();
//	            int n = in.nextInt();
//	        int sum=a;
//	        for(int j=0;j<n;j++){
//	            sum+=b*Math.pow(2,j);
//	            System.out.print(sum+" ");
//	        }
//	        System.out.println();
//	        }
		//question for calculate the sum of first 10 natural number
	/*	int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("Sum:"+sum);
		// multiplication table
		System.out.println("Multiplication Table :");
		int n=2;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d \n",n,i,n*i);
		}
		//factorial number
//		System.out.println("Enter the value of a:");
//		int a=in.nextInt();
		int a=9;
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact*=i;
		}
			System.out.println("Factorial : " + fact);
		//power raised
//			System.out.println("Enter the value of b: ");
//			Double b=in.nextDouble();
			Double b=8.0;
//			System.out.println("Enter the value of p:");
//			Double p=in.nextDouble();
			Double p=2.0;
			Double pow=Math.pow(b, p);
			System.out.println(pow);
			// digits reversed
	/*		System.out.println("Digits:");
			int dig=in.nextInt();
			int reverse=0;
			int temp=dig;
			int remainder=0;
			while(temp>0) {
				remainder=temp%10;
				reverse=reverse*10+remainder;
				temp/=10;
			}
				System.out.println("Reversed of " + dig + "is " + reverse);
				
			// second way to reverse a number
				System.out.println("Enter the value of N: ");
				int N=in.nextInt();
				while(N>0) {
					int digit=N%10;
					N=N/10;
					System.out.print(digit);
				} */
				
				//sum of even and odd integers
		/*		int number;
				int choice;
				int evenSum=0;
				int oddSum=0;
				do {
					System.out.print("Enter the number : ");
					number=in.nextInt();
					if(number%2==0) {
						evenSum+=number;
					}
					else {
						oddSum+=number;
					}
					System.out.println("Do  u wanna continue y/n ?");
					choice=in.next().charAt(0);
					
				} 
				while(choice=='y' || choice =='n');
				
					System.out.println("Sum of the even numbers: " +evenSum);
					System.out.println("Sum of the odd numbers :" +oddSum);*/
				// prime number
		/*			System.out.println("Enter the number u wanna check :");
					int temp1=0;
					int n1=in.nextInt();
					
				for(int i=1;i<=n1;i++) {
					
					if(n1%i==0) {
						temp1++;
						
					}
					
				}
				if(temp1==2) {
					System.out.println("Prime number");
				}
				else {
					System.out.println("Non prime number");
				}*/
				
//				System.out.println("Lower number: ");
//				int lower=in.nextInt();
//				System.out.println("Upper number :");
//				int upper=in.nextInt();
//				for(int i=lower;i<=upper;i++) {
//					int temp2=0;
//					for(int div=2;div*div<=i;div++) {
//					if(i%div==0) {
//						temp2++;
//						break;
//					}
//					}
//					if(temp2==0) {
//					System.out.println(i);
//					}
//		}
		//HCF OF TWO NUMBER
		
//		System.out.println("Enter the value 1:");
//		int n1=in.nextInt();
//		System.out.println("Enter the value 2:");
//		int n2=in.nextInt();
//
//		while(n1%n2!=0) {
//			int rem=n1%n2;
//			n1=n2;
//			n2=rem;
//		}
//		int gcd=n2;
//		int lcm=(on1*on2)/gcd;
//		System.out.println("Greatest common digit :" +gcd );
//		System.out.println(lcm);
		//another way hcf
int N1=625;
int N2=125;
int hcf=0;
for(int i=1;i<=N1|| i<=N2;i++) {
	if(N1%i==0 && N2%i==0) 
		hcf=i;
	}
	System.out.println(hcf);

		
				
			}
	}


