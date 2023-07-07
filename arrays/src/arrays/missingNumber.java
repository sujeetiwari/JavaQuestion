package arrays;

public class missingNumber {
 static void findMissingNumber(int[]arr,int N) {
	 int i;
	 int temp[]=new int [N+1];
	 for(i=0;i<=N;i++) {
		 temp[i]=0;
	 }
	 for(i=0;i<N;i++) {
		temp[arr[i]-1]=1; 
	 }
	 int ans=0;
	 for(i=0;i<=N;i++) {
		 if(temp[i]==0)
			 ans=i+1;
	 }
	 System.out.println("Answer :"+ans);
  }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6};
		int n=arr.length;
		findMissingNumber(arr,n);
		

	}

}
