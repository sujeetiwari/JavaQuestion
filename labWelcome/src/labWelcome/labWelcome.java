package labWelcome;
import java.util.Scanner;
public class labWelcome {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your name :");
    String name=sc.next();
    String greet="Welcome";
    System.out.println(greet + " " + name);
	}

}
