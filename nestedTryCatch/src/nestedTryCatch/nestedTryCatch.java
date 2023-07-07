package nestedTryCatch;
import java.util.Scanner;
public class nestedTryCatch {

	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		int[] marks=new int[3];
		marks[0]=7;
		marks[1]=56;
		marks[2]=6;
//		boolean flag =true;
//		while(flag) {
		System.out.println("Enter the value of index :");
		int index=sc.nextInt();
		try {
			System.out.println("Welcome to video no 82");
			try {
				System.out.println(marks[index]);
				
			
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Sorry this index does not exist");
			System.out.println("Exception in level 2");
		}
		}
		catch(Exception e) {
		System.out.println("Exception in level 1");
		}
	}
	}
//}
