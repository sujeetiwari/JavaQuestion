package arrays;

public class missingNumber1 {

	public static void main(String[] args) {
		float total;
		float [] num=new float[] {1,2,3,5,4,6,8,7}; //15 +6
		System.out.println("Array :");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+"  ");
		}
		System.out.println();
		 total=9;
		float expect=(total*((total+1)/2)); // 
		System.out.println(expect);
		float sum=0;
		for(float i=0;i<total;i++) {
			sum+=i;
		}
		System.out.print("Missing No :" +(expect-sum));
		System.out.println();

		
	}

}
