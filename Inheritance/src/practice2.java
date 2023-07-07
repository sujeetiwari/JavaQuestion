import java.util.Scanner;

class Bank{
	String bank_Name;
	String ifsc_code;
	Bank(String bank_Name,String ifsc_code){
		this.bank_Name=bank_Name;
		this.ifsc_code=ifsc_code;
	}
	void BankInfo() {
		System.out.println("Bank Name :"+bank_Name);
		System.out.println("IFSC CODE :"+ifsc_code);
	}
}
class Customer extends Bank{
	String customer_Name;
	int acc_no;
	int bal;
	double interest;
	Customer(String bank_Name,String ifsc_code,String customer_Name,int acc_no,int bal,double interest){
		super(bank_Name,ifsc_code);
		this.customer_Name=customer_Name;
		this.acc_no=acc_no;
		this.bal=bal;
		this.interest=interest;
	}
	public void deposit(double deposit) {
		 bal+=deposit;
		 System.out.println("Total Amount :"+deposit);
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=bal) {
			bal -=amount;
			System.out.println("Total Amount :"+amount);
		}
		else {
			System.out.println("Insufficient Funds");
		}
		
	}
	public double calculateInterest() {
		return bal * ( interest/100 );
	}
	void CustomerInfo() {
		System.out.println("Customer Name :"+customer_Name);
		System.out.println("Account No :"+acc_no);
		System.out.println("Interest Rate :"+interest);
		System.out.println("Balance :"+bal);
	}
	
}
public class practice2 {

	public static void main(String[] args) {
		Customer c=new Customer("SBI","SBIN0868","Sujeet ",1633641,25000,2);
		c.BankInfo();
		c.CustomerInfo();
		c.calculateInterest();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Choose an option");
			System.out.println(" 1. Withdraw");
			System.out.println(" 2. Deposit");
			System.out.println(" 3. Display Account Information");
			System.out.println(" 4. Interest");
			System.out.println(" 0. Exit ");
			System.out.println("Enter any option :");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter amount :");
				double withdrawAmount=sc.nextDouble();
				c.withdraw(withdrawAmount);
				break;
			case 2:
				System.out.println("Deposit :");
				double depositAmount=sc.nextDouble();
				c.deposit(depositAmount);
				break;
				
			case 3:
				
				c.CustomerInfo();
				break;
				
			case 4 :
				double interest1=c.calculateInterest();
				System.out.println("Interest Rate  " + interest1);
				break;
				
			case 0:
				System.out.println("Existing");
				break;
			
		 default:
	         System.out.println("Invalid choice. Please try again.");
	         break;
			}
		}
			while(choice!=0) ;
				
			
	}

}






















