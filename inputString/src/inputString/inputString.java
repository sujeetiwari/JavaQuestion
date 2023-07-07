package inputString;
import java.util.Scanner;
public class inputString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the balance :");
		int balance=sc.nextInt();
		System.out.println("Enter the deposit");
		int deposit=sc.nextInt();
		System.out.println("Enter the transfer");
		int transfer=sc.nextInt();
		int total=balance+deposit;
		System.out.println("Total balance in the bank "+total);
		int current=total-transfer;
		System.out.println("current balance "+current);
		
		}
	}


