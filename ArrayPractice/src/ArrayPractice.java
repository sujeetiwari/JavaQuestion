import java.util.Scanner;
public class ArrayPractice {

	public static void main(String[] args) {
	/*	float [] marks= {23.4f,56.7f,78.9f};
		float sum=0;
		for(float element:marks) {
			sum=sum+element;
		}
		System.out.println("The value of sum is :" + sum);
        float[] marks= {23.6f,78.4f,98.3f,100.0f};
//        float num=23.6f;
        float num=45.12f;
        boolean isInArray=false;
        for(float element:marks) {
        if(num==element) {
        	isInArray=true;
        	break;
           }
      }  
        if(isInArray) {
        	System.out.println("The value of present in the array");
        }
        else {
        	System.out.println("The value is not present in the array");
        }
		float [] marks= {23.4f,56.7f,78.9f};
		float sum=0;
		for(float element:marks) {
			sum=sum+element;
		}
		System.out.println("The value  of average marks is :" + sum/marks.length);
		int [][] mat1= {{1,2,3} ,
		                {4,5,6}};
		int [][] mat2= {{7,2,9} ,
                        {8,5,9}};
		
		int [][] result= {{0,0,0} ,
                {0,0,0}};
		for(int i=0;i<mat1.length;i++) { //row no. of times
			for( int j=0;j<mat1[i].length;j++) { // column no. of times
				System.out.format("Setting value for i=%d and j=%d\n",i,j);
				result[i][j]=mat1[i][j]+mat2[i][j];
			}
		}			
		// printing the elements of 2-d array
		for(int i=0;i<mat1.length;i++) { //row no. of times
			for( int j=0;j<mat1[i].length;j++) { // column no. of times
				System.out.print(result[i][j] +" ");
				result[i][j]=mat1[i][j] + mat2[i][j];
			}
			System.out.println("");	
		} 
		int [] arr= {1,2,3,4,5,6};
		int l=arr.length;
		int n=Math.floorDiv(l, 2);
		int temp;
		for(int i=0;i<n;i++) {
			// swap a[i] and[l-i-1]
			// a b temp
			// |4| |3|
			temp=arr[i];
			arr[i]=arr[l-i-1];
		    arr[l-i-1]=temp;
		}
		for(int element:arr) {
			System.out.print(element +" ");
		} 
		int[] arr= {23,56,78,12,98,43};
		int max=0;
		for(int element:arr) {
			if(element>max) {
				max=element;
			}
		}
		System.out.println("The value of maximum element in this array :"+max); */
		boolean isSorted=true;
		int [] arr= {1,12,3,4,5,23};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> arr[i+1]) {
				isSorted=false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("The array is sorted");
		}
		else {
			System.out.println("The array is not sorted");
		}
				
	}

}
