package labClass3;

import java.util.Scanner;

public class removeDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Size :");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		System.out.println("Sorting the array in ascending order :");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		System.out.println("Duplicate Array :");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {

					System.out.println(arr[j]);
				}
			}
	}
		System.out.println("Remove Duplicate Array :");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
				}
				
			}
			if(arr[i]!=-1) {
			System.out.println(arr[i]);
		}
			
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	