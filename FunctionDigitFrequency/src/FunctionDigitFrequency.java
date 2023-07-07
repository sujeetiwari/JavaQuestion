import java.util.Scanner;
public class FunctionDigitFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n=sc.nextInt();
		System.out.print("Enter the value of d:");
		int d=sc.nextInt();
		
		int f=getDigitFrequency(n,d);
		System.out.println(f);

	}
	public static int  getDigitFrequency(int n,int d) {
		int rv=0;
		while(n>0) {
			int dig =n%10;
			n=n/10;
			if(dig==d) {
				rv++;
			}
			
		}
		return rv;
	}

}
