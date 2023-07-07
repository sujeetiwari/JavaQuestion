package homePractice2;

public class homePractice2 {

	public static void main(String[] args) {
				
	


		
long num=123;

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

		
//int num1=1;
//int num2=10;
//for(int i=num1;i<=num2;i++) {
//	int temp=0;
//	for(int div=2;div*div<=i;div++) {
//		
//	if(i%div==0) {
//		temp++;
//		break;
//	}
//}
//	if(temp==0) {
//		System.out.println(i);
//}
//}	
		
		
		
		
		
		
		
		
		
		
		
		
		
//	x-1/x+2/x-3+x+4/x-5.............
//		int n=5;
//		int x = 12;
//		int num;
//		int sum=x-1;
//		
//		for(int i=0;i<n;i++) {
//			if(i%2==1) {
//				num=x-1;
//			}
//			else {
//				num=x+2;
//			}
//			sum=sum/num;
//		}
//		System.out.println("sum of :"+sum);

	}

}
