import java.util.Random;
import java.util.Scanner;
class game{
	public int number;
	public int noOfGuesses;
	public int getNoOfGuesses() {
		return noOfGuesses;
	}
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses=noOfGuesses;
	}
	void Game() {
		Random rand=new Random();
		this.number=rand.nextInt(100);
	}
	void takeUserInput() {
		Scanner sc=new Scanner(System.in);
		inputNumber=sc.nextInt();
		
	}
	void isCorrectNumber(int num) {
		if(num==number) {
			return true;
		}
		else if(num<number) {
			System.out.println("Too low...");
		} 
		else if(num>number){
			System.out.println("Too high...");
		}
			return false;
		}
	
}
public class GuessTheNumber {

	public static void main(String[] args) {
		/* Create a class ,game,which allows a user to play "Guess the number"
		 game once,game should have the following methods
		 1. constructor to generate the random number
		 2.takeuserinput() to take a user input of number
		 3. iscorrectnumber() to detect whether the number entered by the user is true
		 4 getter and setter for no of Guesses
		 5 use properties such as no of guesses(int )etc
		 */
          Game g=new game() ;
        	g.takeUserInput();  
          
	}

}
