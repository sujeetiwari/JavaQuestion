package homePractice5;

import java.util.Scanner;

public class homePractice5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		          System.out.println("please enter the no of elements which you wana store");
		          int size=s.nextInt();


		         int a[]=new int[size];//a b t z e------------>a b e t z
		         int len=a.length;

		         for(int i=0;i<len;i++)
		         {
		             a[i]=s.nextInt();
		         }
		        
		         int temp;
		         

		         for(int i=0;i<len;i++)//sorting logic 
		         {
		             for(int j=i+1;j<len;j++)
		             {
		                 if(a[i]>a[j])
		                 {
		                     temp=a[i];
		                     a[i]=a[j];
		                     a[j]=temp;
		                 }
		             }
		         }
		       
		       

		         System.out.println("array after sorting");
		         for(int i=0;i<len;i++)
		         {
		             System.out.println(a[i]);
		         } 

		         

		         System.out.println("second largest no in given  array is  "+a[size-2]);

		          System.out.println("second smallest no in given  array is  "+a[1]);



		     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.print("Size:");
//		int size=sc.nextInt();
//		int [] arr=new int[size];
//		int max=0;
//		System.out.println("Enter the value of arr :");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}
//		}
//		System.out.println("Maximum :"+max);
//		int min=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(min>arr[i]) {
//				min=arr[i];
//		}
//		}
//		System.out.println("Minimum :"+min);
	}

}
