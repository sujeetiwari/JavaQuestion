class InvalidInputException extends Exception{
	public String toString() {
		return "cannot  add 8 and 9";
	}

public String getMessage() {
	return super.getMessage() + "Radius can not be negative";
}
}
class CannotDivideByZeroException extends Exception{
	public String toString() {
		return "cannot  add 8 and 9";
	}
}
class CustomCalculator {
	double add(double a,double b)  throws InvalidInputException{
		if(a==8|| b==9) {
			throw new InvalidInputException();
		}
		return a+b;
	}
	double subtract(double a,double b) {
		return a-b;
	}
	double multiply(double a,double b) {
		return a*b;
	}
	double divide(double a,double b) throws CannotDivideByZeroException {
		if(b==0) {
			throw new  CannotDivideByZeroException();
		}
		return a/b;
	
	}
}
public class project2 {

	public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException {
		CustomCalculator c=new CustomCalculator();
//		c.add(8, 9);
		c.divide(4, 0);
		System.out.println(c);

	}

}
