package arrays;

public class reverseArrays {

	public static void main(String[] args) {
	int[]arr= {12,34,2,45,3,1,56};
	System.out.println("Array:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] +" ");
	}
		System.out.println();
		System.out.println("Reverse Array :");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}

	}

}
