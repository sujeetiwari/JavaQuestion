package throwThrows;
class NegativeRadiusException extends Exception{
	public String toString() {
		return super.toString() + " I am toString()";
	}

public String getMessage() {
	return super.getMessage() + "Radius can not be negative";
}
}



public class throwThrows {
	static  double area(int r) throws NegativeRadiusException {
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double result=Math.PI*r*r;
		return result;
		
	}
static	int divide(int a,int b) throws ArithmeticException {
		int result=a/b;
		return result;
	}

	public static void main(String[] args) {
		try {
//int c=divide(3,0);
	double ar= area(6);
	System.out.println(ar); //c

	}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}
}
