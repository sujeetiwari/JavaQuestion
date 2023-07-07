import java.util.Scanner;

public class practiceErrorException {

	public static void main(String[] args) {
//	Problem 1
//	Syntax error
//		int a=7 
//		logical error
//		int age =39;
//		int year_born=2000-39;
//		Exception
//		System.out.println(7/0);
//		problem 2
		try {
			int a=66/-0;
			System.out.println(a);
		}
		catch(IllegalArgumentException e) {
			System.out.println("hehe");
		}
		catch(ArithmeticException e) {
			System.out.println("haha");
		}
//problem 3
		boolean flag=true;
		Scanner sc =new  Scanner(System.in);
		int[] marks=new int[3];
		marks[0]=7;
		marks[1]=56;
		marks[2]=6;
		int index;
		int i=0;
		while(flag && i<5) {
			try {
				System.out.println("The value of index :");
			index=sc.nextInt();
			System.out.println("The value of marks[index] is " + marks[index]);
		}
			catch(Exception e) {
				System.out.println("invalid index");
			}
				i++;
				
			}
		if(i>=5) {
			System.out.println("errors");
		}
	}

}
