package oopsPractice;

interface BankAccount{
	void deposit(int amt);
	void withdraw(int amt);
}
  class CheckingAccount implements BankAccount{
	  int bal;
	  public void withdraw(int amount) {
			 bal=bal-amount;  
		  }
	  public void deposit(int amt) {
		  bal=bal+amt;	   
		  System.out.println("Current balance  :"+bal);	  
	  }
	 
  }
public class Bank {

	public static void main(String[] args) {
	 CheckingAccount c=new CheckingAccount();
	 
	 c.deposit(4200);
     c.withdraw(1202);
	}

}
