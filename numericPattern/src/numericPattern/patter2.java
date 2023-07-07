package numericPattern;

public class patter2 {

	public static void main(String[] args) {
		/* 1 
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) { 
				System.out.print(j+" ");
			}
			System.out.println();
		}
		 /*
		  54321 
		  4321
		  321
		  21
		  1 
		  */
		System.out.println("Reverse a pattern :");
		int a=5;
		for(int i=1;i<=a;i++) {
			for(int j=5;j>=i;j--) { 
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*
		 1 
		 22
		 333
		 4444
		 55555
		 */
		System.out.println("Simple Pattern :");
		int b=5;
		for(int i=1;i<=b;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");	
			}
			System.out.println();
		}
		System.out.println("Simple Reverse Pattern :");
		int c=5;
		for(int i=1;i<=c;i++) {
			for(int j=5;j<=i;j--) {
				System.out.print(i+" ");	
			}
			System.out.println();
		}

	}

}














