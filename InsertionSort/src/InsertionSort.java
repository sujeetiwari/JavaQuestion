import java.util.Scanner;
public class InsertionSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		} 
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int arr[]= {4,1,8,2,6,3,9,7};
	for(int i=1;i<arr.length;i++) {
		int current=arr[i];
		int j=i-1;
		while(j>=0 && arr[j] >current) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=current;
	}
	printArray(arr);

	}

}
