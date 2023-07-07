import java.util.Scanner;
public class OddEvenNumber {

	public static void main(String[] args) {
		int num ;
		System.out.println("Enter an integer :");
		Scanner input=new Scanner(System.in);
		 num=input.nextInt();
		   if(num%2==0) {
			System.out.println("Even number");
		   }
		       else {
			   System.out.println("odd number");
		       }

	}

}
