package numericPattern;

public class pattern1 {

	public static void main(String[] args) {
		// 1 2 3 4 5 // 5 4 3 2 1 
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print(i+" ");
//				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
