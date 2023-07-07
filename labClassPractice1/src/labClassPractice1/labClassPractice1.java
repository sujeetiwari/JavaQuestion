package labClassPractice1;
import java.util.*;
public class labClassPractice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("C++ :");
		double c=sc.nextDouble();
		System.out.println("Java :");
		double java=sc.nextDouble();
		System.out.println("Math :");
		double math=sc.nextDouble();
		System.out.println("Science:");
		double science=sc.nextDouble();
		System.out.println("English:");
		double eng=sc.nextDouble();
		
		double per=(c+java+math+science+eng)/5;
		System.out.println("Enter the percentage of student:" +per);
		if(per>=90) {
			System.out.println("Excellent");
		}
		else if(per>70) {
			System.out.println("Good");
		}
		else if(per>40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

		
//		Triangle
	/*	for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/

//		Square
		
	/*	for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("* ");
			}
			System.out.println();
		} */
		
	}

}
