import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter an age:");
		Scanner input=new Scanner(System.in);
		age=input.nextInt();
		  if(age>18) {
          System.out.println("They can vote");
		  }
		     else {
		    	 System.out.println("They cannot vote");
			  
		     }
	}

}
