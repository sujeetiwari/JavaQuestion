package oopsPractice;

import java.util.Scanner;

class ShowRoom{

	   String name;
	   long mobile_no;
       double cost;
	   double amount;
	   double discount;
	   ShowRoom(){}
	 void input(String name,long mobile_no,double cost){
		 this.name=name;
		 this.mobile_no=mobile_no;
		 this.cost=cost;

	 }
		
	void calculate() {
		if(cost<=10000) {
			discount=(cost*5)/100;
			amount=cost-discount;

		}
		else if(cost<=20000) {
			discount=(cost*10)/100;
		amount=cost-discount;
			
		}
		else if(cost<=35000) {
			discount=(cost*15)/100;
			amount=cost-discount;

			
		}
		else {
			discount=(cost*20)/100;				
		    amount=cost-discount;

		} 
		
	}
   public void display() {
	System.out.println("Customer Name :"+name);
	System.out.println("Mobile "+mobile_no);
	System.out.println("Amount to be paid after discount :"+amount);	
}
	
}

public class Test {

	public static void main(String[] args) {
		ShowRoom s=new ShowRoom();
		Scanner sc=new Scanner(System.in);
		System.out.print("Name :");
		String name=sc.nextLine();
		System.out.print("Mobile No :");
		long mobile_no=sc.nextLong();
		System.out.print("Cost  of purchased item :");
		double cost=sc.nextDouble();
		s.input(name,mobile_no,cost);
		s.calculate();
	    s.display();
			
		

	}

}
