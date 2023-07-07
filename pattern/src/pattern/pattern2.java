package pattern;

public class pattern2 {

	public static void main(String[] args) {
		int line=5;
		for(int i=1;i<=line;i++) {
			for(int j=line;j>=1;j--) {
				if(i!=j) {
					System.out.print(i+" ");
				}
				else {
					System.out.print(" x");
				}
			}
			System.out.println();
		}

	}

}
