
class MyException extends Exception{
	public String toString() {
		return super.toString() + " I am toString()";
	}

public String getMessage() {
	return super.getMessage() + "I am get message";
}
}

public class exceptionClass {

	public static void main(String[] args) {
		int a=1;
		if(a<9) {
			try {
//			throw new MyException();
			throw new ArithmeticException("this is an exception");
		}
catch(Exception e) {
	System.out.println(e.getMessage());
	System.out.println(e.toString());
	e.printStackTrace();// this is help for which line is in error
	System.out.println("finished");
}
			System.out.println("Yes finished");
	}
	}
}
