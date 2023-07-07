package labClass3;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int [] arr= {12,23,1,65,32};
		int flag=0,i;
		for( i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the element u want to find the position :");
		int x=s.nextInt();
		for( i=0;i<arr.length;i++ ) {
			if(arr[i]==x) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("Enter the position : "+i);
		}
		else {
			System.out.println("not found");
		}

	}

}
