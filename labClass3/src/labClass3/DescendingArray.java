package labClass3;

import java.util.Scanner;

public class DescendingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[10];
		System.out.println("Enter the element of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Descending Order :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
