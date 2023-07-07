
public class StringQuestion {

	public static void main(String[] args) {
	String name="HELLO SUJEET  ";
	System.out.println(name);
	System.out.println(name.toLowerCase());
	String text="He     is        my friend";
text=text.replace(" ","_ ");
System.out.println(text);
    String letter="Dear<|name|>,Thanks a lot";
    letter=letter.replace("<|name|>","Sujeet ");
    System.out.println(letter);
    String myString="This string contains double and triple spaces";
    System.out.println(myString.indexOf(" "));
    System.out.println(myString.indexOf(" "));
    String myLetter="Dear Sujeet \n \tThis java course is nice.\n\t\t\t\tThanks";
    System.out.println(myLetter);
    
	}

}
