package labClassPractice5;

import java.util.Scanner;

public class labClassPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int [] arr= {12,34,21,56,32};
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Enter the element of unsorted array " +i+": "+arr[i]);
		 }
		 int temp;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) { 
				 if(arr[i]>arr[j]) {  
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp; //34 56
				 }
			 }
		 }
		 System.out.println("Array after sorting :");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 System.out.println("Second largest :"+arr[5-2]);
		System.out.println("Second minimum :"+arr[1]);

		
		
		
		
		
		
		
		
		
		
		
		
//		int [] arr= {12,23,43,5,21,56};
//		int []arr=new int[5];
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("no:");
//			arr[i]=sc.nextInt();
//		}
//        int max=arr[0];
//		int min=arr[0];
//       
//
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter the value of n:" +arr[i]);
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println("Minimum no :"+min);
//		System.out.println("Maximum no :"+max);
		


	}

}
