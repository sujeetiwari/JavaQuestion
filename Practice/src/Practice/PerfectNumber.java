package Practice;

public class PerfectNumber {

	public static void main(String[] args) {
		long num=28;

		int sum=0;
		int i=1;
		while(i<=num/2) {
			
			if(num%i==0) {
				sum=sum+i;
			}
			 i++;
			 
		}
		System.out.println("sum:"+sum);
		if(sum==num) {
			System.out.println("Perfect number :"+num);
		}
		else {
			System.out.println("Non Perfect Number :" +num);
		}

	}

}
