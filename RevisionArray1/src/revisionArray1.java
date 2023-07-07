import java.util.Arrays;
public class revisionArray1 {
	

	public static void main(String[] args) {
	//Reverse Array
	int [] array= {12,45,87,2,25,76,6};
//	for(int i=0;i<array.length/2;i++) {
//		int temp=array[i];
//		array[i]=array[array.length-i-1];
//		array[array.length-i-1]=temp;
//	}
	System.out.println("Original Array");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i] +" ");
	}
	System.out.println();
	System.out.println("Reverse Array :");
	for(int i=array.length-1;i>=0;i--) {
	System.out.print(  array[i] +" ");
	}
	System.out.println();
	// Copy Element
//	int a[]= {10,20,30,40,50};
//	int b[]=new int[5];
//	for(int i=0;i<a.length;i++) {
//		System.out.print(a[i] + " ");
//	}
//	for(int i=0;i<array.length;i++) {
//		 b[i]=a[i];
//		System.out.println(b[i] +" ");
//	}
	// max and minimum
	int [] arr= {12,2,65,9,21,4};
	findMinAndMax(arr);
	}
	static void findMinAndMax(int[] arr) {
		if(arr==null||arr.length==0)
			return;
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
//			System.out.print("Original Array "+arr[i]);
			min=Math.min(min,arr[i]);
			max=Math.max(max, arr[i]);
//			if(arr[i]<min) {
//				min=arr[i];
//				
//			}
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			
		}
		System.out.println(min + " Minimum");
		System.out.println(max + " Maximum");
//	}
	}	
}


