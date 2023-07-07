package labClassPractice3;

import java.util.Scanner;

public class labClassPractice3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][] a=new int[2][2];
		int [][] b=new int[2][2];
		int [][]sum=new int[2][2];
		System.out.println("Matrix of a:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("Matrix of "+"("+i+","+j+")"+":");
				a[i][j]=sc.nextInt();
				
			}
			System.out.println();
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				
				
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Matrix of b :");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("Matrix of "+"("+i+","+j+")"+":");
				b[i][j]=sc.nextInt();
				
			}
			System.out.println();
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				
				
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Sum  of a+b :");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		}
		}

	



/*System.out.println(" Name " + " Marks ");
String [] name= {"Sujeet","Sahil","Mohit","Akash","Ayush","Saurav","Tushar",
		"Vinay","Saksham","Varun"};
int [] marks= {98,34,56,24,67,12,46,76,87,47};
for(int i=0;i<name.length;i++) {
	
	System.out.println(name[i] + "  " + marks[i] );
	
	matrix 2-d
	
		int[] []a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]b={{11,12,31},{14,25,2},{71,21,19}};
		System.out.println("Matrix of a:");
		int sum[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		System.out.print(a[i][j] +" ");	
			}
			
			System.out.println();
		}
		System.out.println("Matrix of b:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		
		System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Sum of matrix :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		
				sum[i][j]=a[i][j] +b[i][j];
		System.out.print(sum[i][j] +" ");
			}
			System.out.println();
		}
}*/