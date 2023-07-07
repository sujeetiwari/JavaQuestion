package againPractice;
import java.util.*;


public class againPractice {

	public static void main(String[] args) {

       int ch,a=8,b=5;

       Scanner sc=new Scanner(System.in); 

       System.out.println("----------press---------");
       System.out.println("1 for addition");
       System.out.println("2 for subtraction");
       System.out.println("3 for multiplication");
       System.out.println("4 for division");

       ch=sc.nextInt();

       switch(ch)
       {
          case 1:System.out.println(a+b);
          break;


          case 2:System.out.println(a-b);
          break;

        
          case 3:System.out.println(a*b);
          break;



          case 4:System.out.println(a/b);


       }

       System.out.println("exit from switch block");
       
   }

	

}


