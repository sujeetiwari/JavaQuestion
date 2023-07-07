import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorsGame {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	Random random=new Random();
	String r="Rock";
	String p="Paper";
	String s="Scissors";
	String  [] plays= {r,p,s};
	boolean quit=false;
	String comPlay;
	String yourPlay;
	int index;
	while(!quit) {
		System.out.println("Do your play:(Rock/Paper/Scissors)");
		yourPlay=scanner.nextLine();
		index=random.nextInt(3);
		comPlay=plays[index];
		System.out.println("your Play :"+ yourPlay +" Computer's play:"+comPlay);
		if(yourPlay.equals(comPlay)) {
			System.out.println("Tie!!");
		}else if(yourPlay.equals(r) && comPlay.equals(p)) {
			System.out.println("Computer Wins!!");
		}else if(yourPlay.equals(r)&& comPlay.equals(s)) {
			System.out.println("You Wins!!");
		}else if(yourPlay.equals(p)&& comPlay.equals(r)) {
			System.out.println("You Wins!!");
		}else if(yourPlay.equals(p)&& comPlay.equals(s)) {	
			System.out.println("Computer Wins");
		}else if(yourPlay.equals(s)&& comPlay.equals(r)) {	
			System.out.println("Computer Wins!!");
		}else if(yourPlay.equals(s)&& comPlay.equals(p)) {
			System.out.println("You Wins!!");
		} else {
			System.out.println("invalid play");
		}
			System.out.println();
			System.out.println();
		}
	}

	}


