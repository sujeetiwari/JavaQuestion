package labClass3;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Size :");
		int size=sc.nextInt();
		int [] arr=new int[size];
		int max=0;
		System.out.println("Enter the element of an array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();

		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximum :"+max);
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimum :"+min);

	}

}
