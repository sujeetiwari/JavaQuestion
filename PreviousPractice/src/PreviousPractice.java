import java.util.Scanner;
public class PreviousPractice {

	public static void main(String[] args) {
		System.out.println("Enter the prime number:");
		Scanner sc=new Scanner(System.in);
int low=sc.nextInt();
int high=sc.nextInt();
for(int n= low;n<=high;n++) {
	int count=0;// count tell us how much time divide
//	 try to divide n and increment count\
	for(int div=2;div*div<=n;div++) {
		if(n%div==0) {
			count++;
			break;
		}
	}
//	try to divide n and increment count
	if(count==0) {
		System.out.println(n);
	}
}
	}

}
