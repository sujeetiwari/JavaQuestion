import java.util.Scanner;
public class Cgpa {

	public static void main(String[] args) {
		float cgpa;
		float english;
		float mathematics;
		float physics;
		float chemistry;
		float hindi;
		System.out.println("The marks of 12th class :");
		Scanner sc=new Scanner(System.in);
		System.out.println("English :");
		english=sc.nextFloat();
		System.out.println("Mathematics :");
		mathematics=sc.nextFloat();
		System.out.println("Physics");
		physics=sc.nextFloat();
		System.out.println("Chemistry");
		chemistry=sc.nextFloat();
		System.out.println("Hindi");
        hindi=sc.nextFloat();
        cgpa=(english+mathematics+physics+chemistry+hindi) /5;
        System.out.println(cgpa);
	}

}
