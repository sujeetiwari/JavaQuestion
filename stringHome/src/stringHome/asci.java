package stringHome;

public class asci {

	public static void main(String[] args) {
		int ch='a';
		int ch1='A';
		System.out.println("The ascii value of a :"+ch);
		System.out.println("The ascii value of A :"+ch1);
		
		char ch2='A';
		for(int i='A';i<='z';i++) {
			System.out.println("The  Asci value of " + ch2 + " is "+i );
			ch2++;
		}
	}

}
