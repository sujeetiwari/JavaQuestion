package exception;

public class PropogateOddEven {
	static void OddEvenException(int n)  {
		
		if(n<1) {
			ArithmeticException e=new ArithmeticException("No is greater than 0 ");
			throw e;
		}
			if(n%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("Odd");
			}
			
		}
	

	public static void main(String[] args) {

		try {
			OddEvenException(-12);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
