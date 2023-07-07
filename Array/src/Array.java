import java.util.Scanner;
public class Array {
public static void swap(int[] marks,int i,int j) {
	int temp=marks[i];
	marks[i]=marks[j];
	marks[j]=temp;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] marks;
		marks=new int[5];
		marks[0]=44;
		marks[1]=24;
		marks[2]=54;
		marks[3]=64;
		marks[4]=94;
//		System.out.println(marks.length);
//for(int i=0;i<=marks.length;i++) {
//	System.out.println(marks[i]);
//}
//		int []two=marks;
//		two[2]=590;
//		for(int i=0;i<=two.length;i++) {
//			System.out.println(two[i]);
//		}
		swap(marks,0,3);
		for(int i=0;i<=marks.length;i++) {
			System.out.println(marks[i]);
		}
	}

}
