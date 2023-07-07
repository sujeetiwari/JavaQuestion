package exception;

public class PropogateException {
	public void NullException() {
		String a=null;
	if("e".endsWith(a)) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	}

	public static void main(String[] args) {
		PropogateException p=new PropogateException();
		try {
			p.NullException();
		}
		catch(NullPointerException e) {
			System.out.println("Don't write null value");
			
		}

	}

}
