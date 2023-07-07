import java.util.Scanner;
public class AllPractice {

	public static void main(String[] args) {
	System.out.print("Enter a number :");
	Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
//int digit=0;
//while(n!=0) {
//	n=n/10;
//	digit++;
//}
//System.out.println("No of count digits :" +digit);
//	int n=sc.nextInt();
//	int nod=0;
//	int temp=n;
//	while(temp !=0) {
//		temp=temp/10;
//		nod++;
//	}
//	int div=(int)Math.pow(10,nod-1);
//	while(n!=0) {
//		int q=n/div;
//		System.out.println(q);
//		n=n%div;
//		div=div/10;
//	}
/*	int n= sc.nextInt();
	while(n>0) {
		int digit=n%10;
		n=n/10;
		System.out.println(digit);
	}*/
	int n=sc.nextInt();
	int inv=0;
	int op=1;
	while(n!=0) {
		int od=n%10;
		int id=op;
		int ip=od;
		inv=inv+id*(int)Math.pow(10,ip-1 );
		n=n/10;
		op++;
	}
	System.out.println(inv);
	
		}
}
