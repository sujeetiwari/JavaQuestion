
public class tryCatch {

	public static void main(String[] args) {
		int a=490;
		int b=0;
		try {
			int c=a/b;
			System.out.println("The result of c :"+c);
			
		}
		catch(Exception e){
			System.out.println("we failed to divide . Reason:");
			System.out.println(e);
			
		}

	}

}
