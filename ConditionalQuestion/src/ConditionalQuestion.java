import java.util.Scanner;
public class ConditionalQuestion {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a number");
/*	int num=sc.nextInt();
	if(num%2==0) {
		System.out.println("It is an even number");
	}
	else {
		System.out.println("It is a odd number");
	}*/
	/*System.out.print("Enter a year:");
	int year=sc.nextInt();
	if(year%4==0) {
		System.out.println("It's a leap year");
	}
	else {
		System.out.println("It's not a leap year");
	}*/
	//System.out.print("Enter a number :");
//	int day=sc.nextInt();
/* switch(day) {
	case 1 ->  System.out.println("Monday");
	case 2 ->  System.out.println("Monday");
	case 3 ->  System.out.println("Tuesday");
	case 4 ->  System.out.println("Wednesday");
	case 5 ->  System.out.println("Thursday");
	case 6 ->  System.out.println("Friday");
	case 7 ->  System.out.println("Saturday");
}*/
/*	System.out.print("Enter an age :");
	int age=sc.nextInt();
	switch(age) {
	case 12:
		System.out.println("They are kids");
		break;
	case 20:
		System.out.println("They are adults");
		break;
		default:
			System.out.println("They are old person");
	}*/
	System.out.println("Enter a marks of physics:");
		float physics=sc.nextFloat();
		System.out.println("Enter a marks of chemistry");
		float chemistry=sc.nextFloat();
		System.out.println("Enter a marks of math:");
		float math=sc.nextFloat();
		float average=(physics+chemistry+math)/3.0f;
		System.out.println(average);
		if(average>=40 && physics>=33 && chemistry>=33 && math>=33) {
			System.out.println("Congratulations , You have prompted");
		}
			else {
				System.out.println("Sorry,you have not prompted");
				
		}
	}
}

