import java.util.Scanner;
public class BubbleSort {
 public static void printArray(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
}
// in coding exam we never use bubble sort,selection sort, insertion sort
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		timecomplexity=0(n^2)
		int arr[]= {7,8,3,1,2};
		for(int i=0;i<arr.length-1;i++) { //n-1
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
//					swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
         printArray(arr);
	}

}
