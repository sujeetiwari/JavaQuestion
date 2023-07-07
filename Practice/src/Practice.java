import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[10];
		double sum=0;
		
		for(int i=0;i<10;i++) {
			System.out.print("Enter the  value of a  "+i+":");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			sum +=(a[i]*a[i]);	
			
		}
		System.out.println("Sum of square :"+sum);

        
	}

}
