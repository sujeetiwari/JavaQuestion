package labClass5;

import java.util.Scanner;

public class VotingApplicationException {
	static void VotingAge(int age) {
		if(age<18) {
		throw new ArithmeticException("Age is  less than 18 then you can't give vote");
		}
		else {
			System.out.println("You can give vote");
		}
	}

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the age :");
	 int age=sc.nextInt();
	 try 
	 {
		 
		 VotingAge(age);
	 }
	 catch(Exception e) {
		 System.out.println("Exception Occured :"+e);
		 
	 }

	}

}
