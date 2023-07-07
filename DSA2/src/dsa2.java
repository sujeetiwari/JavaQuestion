
import java.util.Scanner;

public class dsa2 {
public static void Tushar(int []nums){
	int n=nums.length;
    int[]ans=new int [2*n];
    for(int i=0;i<n;i++){
        ans[i]=nums[i];
        ans[i+n]=nums[i];
        
    }
    
        
    System.out.println(ans);
}


	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of N:");
int n=sc.nextInt();
int[]nums=new int[n];
for(int i=0;i<n;i++) {
nums[i]=sc.nextInt();	
}
  Tushar(nums);
//System.out.println(abc);
	}
}