package helloworld;

import java.util.Scanner;
public class helloworld {
	private static double balance=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Welcome to the Banking Application !");
		while(true) {
			System.out.println("Choose an option :");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the amount to deposit :");
				double depositAmount=sc.nextDouble();
				deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw:");
				double withdrawAmount=sc.nextDouble();
				withdraw(withdrawAmount);
				break;
			case 3:
				checkBalance();
				break;
			case 4:
				System.out.println("Thankyou for using the Banking Application");
				return;
				default:
					System.out.println("Invalid Choice.Please try again.");
			}
			System.out.println();			
		}	
	}
	public static void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposit successful. Current balance : "+balance);
		}
			else {
				System.out.println("Invalid amount. Please enter a positive value.");
			}
		}
	public static void withdraw(double amount) {
		if(amount>0) {
			balance-=amount;
			System.out.println("Withdrawal successful. Current balance : "+balance);
		}
			else {
				System.out.println("Insufficient funds");
			}
	}
        public static void checkBalance() {
        	System.out.println("Current balance :"+balance);
		}
	}

		
	

