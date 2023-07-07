package labPractice;
import java.util.Scanner;
public class labPractice {
	
	public static void main(String[] args) {
		int bal=25000;
		int ch,amt,si,res;
		do
		{
		System.out.println("Press");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Display Current Balance");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();

		switch(ch)
		{
		case 1:
		{
		System.out.println("Enter amount you want to deposit :");
		amt=s.nextInt();
		bal=bal+amt;
		break;
		}
		case 2:
		{
		System.out.println("Enter amount you want withdraw :");
		amt=s.nextInt();
		bal=bal-amt;
		break;
		}
		case 3:
		{
			
        si=(bal*12*1)/100;
    	bal=bal+si;
		System.out.println("Current balance is : "+bal);
		break;
		}
		}
		System.out.println("Press y if u want to continue");
		res=s.next().charAt(0);
		}while(res=='y');
		System.out.println("Thankyou for using bank application ");
        }
	
	}



