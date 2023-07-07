package labClassPractice2;
import java.util.*;
public class labClassPractice2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("num1:");
		int num1=sc.nextInt();
		System.out.println("num2:");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("num1 is greater than num2");
		}
		else if(num2>num1) {
			System.out.println("num2 is greater than num1");
		}
		else {
			System.out.println("Both numbers are equal");
		}
	
		}

}























/*String[] name= {"Sujeet","Mohit","Ayush","Akhil","Tushar"};
int[] marks= {85,67,12,98,46};
System.out.println("Display the student marks of more than 50%");
for(int i=0;i<marks.length;i++) {
	if(marks[i]>50) {
		System.out.println("Name :"+name[i] +  "," + "   Marks :"+ marks[i]);
	}
}

 */


/*for(int i=1;i<=5;i++) {
	for(int j=5;j>=i;j--) {
		System.out.print("* ");
	}
	System.out.println();
}
*/
/*System.out.println("a:");
int a=sc.nextInt();
System.out.println("b:");
int b=sc.nextInt();
if(a>b) {
	System.out.println("a is greater than b");
}
else {
	System.out.println("b is greater than a");
}*/
/*System.out.println("Number :");
int num=sc.nextInt();
int sum=0;
int rem ;
while(num>0) {
	rem=num % 10 ;
	sum=(rem*rem)+sum;
	num=num/10;
}
System.out.println("Sum of the square of all the digits no : "+sum);*/


/*System.out.println("num1:");
int num1=sc.nextInt();
System.out.println("num1:");
int num2=sc.nextInt();
if(num1>num2) {
	System.out.println("num1 is greater than num2");
}
else if(num2>num1) {
	System.out.println("num2 is greater than num1");
}
else {
	System.out.println("Both numbers are equal");
}*/

/*System.out.println("Enter the number:");
int num=sc.nextInt();
int orgNumber;
int rem;
int result=0;
orgNumber=num;
while(orgNumber>0) {
	rem=orgNumber%10;
	result+=Math.pow(rem,3);
	orgNumber=orgNumber/10;
}
if(result==num) {
	System.out.println(num + " is a Armstrong Number");
}
else {
	System.out.println(num + " is not a Armstrong Number");
}*/