package labClass3;

import java.util.Scanner;

public class SubtractMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][]a=new int[3][3];
		int[][]b= new int[3][3];
		int[][]c=new int[3][3];
		System.out.println(" A:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix of A:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println(" B:");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix of B:");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Subtraction of two matrix:");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}

	}

}
