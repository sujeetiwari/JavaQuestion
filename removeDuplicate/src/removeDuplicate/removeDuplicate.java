package removeDuplicate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicate {
	public static void removeArr() {
	int arr[]= {1,2,3,1,3,4,6,2,3,4,1};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				arr[j]=arr[arr.length-1];
				arr[arr.length-1]=0;
				arr=Arrays.copyOf(arr, arr.length-1);
				j--;
				
			}
		}
				
	}
	for(int element:arr) {
		System.out.println(element +" ");
	}
		} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
   removeArr();
}
}
