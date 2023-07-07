import java.util.Scanner;
public class FunctionPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a input an integer:");
	int digit=sc.nextInt();
	System.out.println("The sum digits is :" + sumDigits(digit));
	}
	static int sumDigits(long n) {
		int result=0;
		while(n>0) {
			result+=n%10;
			n/=10;
		}
		return result;
	}

}
