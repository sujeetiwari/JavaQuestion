import java.util.Scanner;
public class Recursion {
static int factorial(int n) {
//	fact(n)=n*fact(n-1)
	if(n==0||n==1) {
		return 1;
	}
	else {
		return n*factorial(n-1);
	}
}
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int x=6;
System.out.println("The value of factorial x is :"  + factorial(x));
	}

}
