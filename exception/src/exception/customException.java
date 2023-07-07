package exception;

 class AgeException extends Exception{
	 public AgeException(String a) {
		 super(a);
	 }
 }
public class customException {
	static void validate(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("Age is not valid to vote");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		try {
			validate(13);
		}
		catch(AgeException ex) {
			
			System.out.println("Exception Occcured :"+ex);
		}
		finally {
			System.out.println("Rest of the code");
		}
	}

}
