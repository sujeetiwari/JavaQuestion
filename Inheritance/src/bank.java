//import java.util.Scanner;
//
//public class bank {
//
//   private	int acc_no;
//   private	String name;
//   private	double bal;
//   private double interestRate;
//	bank(int acc_no,String name,double bal,double interestRate){
//		this.acc_no=acc_no;
//		this.name=name;
//		this.bal=bal;
//		this.interestRate=interestRate;
//	}
//	public void withdraw(double amount) {
//		if(amount>0 && amount<=bal) {
//			bal=bal-amount;
//			System.out.println("Withdrawal of Rs. : " + amount + "Successfully");
//			
//		}
//		else {
//			System.out.println("Insufficent Funds");
//		}
//	}
//	public void deposit(double deposit) {
//		deposit=deposit+bal;
//		
//		System.out.println("Deposit"+deposit);
//	}
//	public double calculateInterest() {
//		return bal * (interestRate/100);
//		
//	}
//	void displayInfo() {
//		System.out.println("Account no :"+acc_no);
//		System.out.println("Name :"+name);
//		System.out.println("Balance :"+bal);
////		System.out.println("InterestRate : " +interestRate);
//	}
//	
//		
//
//	public static void main(String[] args) {
//	 Scanner sc=new Scanner(System.in);
//	 System.out.print("Account No :");
//	 int acc_no=sc.nextInt();
//	 sc.nextLine();
//	 System.out.println("Customer Name :");
//	 String name=sc.nextLine();
//	 System.out.print("Balance :");
//	 double bal=sc.nextDouble();
//	 System.out.print("Interest Rate :");
//	 double interestRate=sc.nextDouble();
//	 bank bankAccount=new bank(acc_no,name,bal,interestRate);
//	 bankAccount.displayInfo();
//	
//	 int choice;
//	 do {
//		 System.out.println("Choose an option");
//		 System.out.println("1. Withdraw Money");
//		 System.out.println("2. Deposit Money");
//		 System.out.println("3. Calculate Interest");
//		 System.out.println("4. Display Information");
//		 System.out.println(" 5.Exit");
//		 
//		 System.out.println("Enter your choice :");
//		 choice=sc.nextInt();
//	 
//	 switch(choice) {
//     case 1:
//         System.out.print("Enter Withdrawal Amount: ");
//         double withdrawalAmount = sc.nextDouble();
//         bankAccount.withdraw(withdrawalAmount);
//         break;
//     case 2:
//    System.out.print("Enter Deposit Amount: ");
//    double depositAmount = sc.nextDouble();
//     bankAccount.deposit(depositAmount);
//    break;
//   case 3:
//   double interest = bankAccount.calculateInterest();
//   System.out.println("Interest earned: Rs." + interest);
//     break;
//	 case 4:
//         bankAccount.displayInfo();
//         break;
//     case 0:
//         System.out.println("Exiting...");
//         break;
//     default:
//         System.out.println("Invalid choice. Please try again.");
//         break;
// }
//} while (choice != 0);
//	
//	
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
