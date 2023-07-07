import java.util.Scanner;
public class LoopAnswer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	/*	int n=5;
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}   */
//		Patttern 5
	/*	int n=5;
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++) {
			for( int j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			for( int j=1;j<=st;j++) {
			System.out.print("*\t");	
			}
//			System.out.println(sp + "," + st);
	if(i<=n/2) {
		sp--;
		st+=2;
		
	} else {
		sp++;
		st-=2;
	}
	System.out.println();
		} */
//		Pattern 6
/*		int n=5;
		int st=n/2+1;
		int sp=1;
		for(int i=1;i<=n;i++) {
//		System.out.println(st +"," +sp + "," +st);	
		for(int j=1;j<=st;j++) {
			System.out.print("*\t");
		}
		for(int j=1;j<=sp;j++) {
			System.out.print("\t");
		}
		for(int j=1;j<=st;j++) {
			System.out.print("*\t");
		}
		if(i<=n/2) {
			st--;
			sp+=2;
		}
		else {
			st++;
			sp-=2;
		}
		System.out.println();
		
	}		*/
//		Pattern 7
	/*	int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(i==j) {
				System.out.print("*\t");
			}
			else {
				System.out.print("\t");
			}
				
			}
			System.out.println();	
		
			
		} */
//		Pattern 8
	/*	int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n+1) {
					System.out.print("*\t");
				}else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		} */
//		Pattern 9
	/*	int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		} */
//		Pattern 10
	/*	int n=5;
		int os=n/2;
		int is=-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=os;j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			
			for(int j=1;j<=is;j++) {
				System.out.print("\t");
			}
			if(i>1 && i<n) {
				System.out.print("*\t");
			}
		//	System.out.println(os+","+ is);
		
		if(i<=n/2) {
			os--;
			is+=2;
		} else {
			os++;
			is-=2;
		}
		System.out.println();
		}  */
//		Pattern 11
		
/*		int n=5;
		int val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print( val+"\t");
				val++;
			}
			System.out.println();
		}  */
//		Pattern 12
/*		int n=5;
		int a=0;
		int b=1;
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+ "\t");
				int c=a+b;
				a=b;
				b=c;
				
			}
			System.out.println();
		}  */
//		Pattern 13
		
	/*	int n=5;
		for(int i=0;i<=n;i++) {
			int icj=1;
			for(int j=0;j<=i;j++) {
				System.out.print(icj+"\t");
				int icjp1=icj*(i-j)/(j+1);
				icj=icjp1;
			}
			System.out.println();
		} 
//		Pattern 14
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d X %d=%d \n",n,i,n*i);
		}
		System.out.print("\n"); */
//	Pattern 15
/*	int n=5;
		int sp=n/2;
		int st=1;
		int val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
			System.out.print("\t");	
			}
			int cval=val;
			for( int j=1;j<=st;j++) {
			System.out.print(cval+"\t");
			if(j<=st/2) {
				cval++;
			}else {
			cval--;
			}
			}
			if(i<=n/2) {
				sp--;
				st+=2;
				val++;
			}else {
				sp++;
				st-=2;
				val--;
			}
			System.out.println();
		} */
//		Practice 16
	/*	int n=4;
		int st=1;
		int sp=2*n-3;
		for(int i=1;i<=n;i++) {
			int val=1;
			for(int j=1;j<=st;j++) {
			System.out.print(val +"\t");
			val++;
			}
		for(int j=1;j<=sp;j++) {
		System.out.print("\t");	
		}
		if(i==n) {
			st--;
			val--;
		}
		for(int j=1;j<=st;j++) {
			val--;
		System.out.print( val +"\t");	
		}
		st++;
		sp-=2;
		System.out.println();
		} */
//		Practice 17
	/*	int n=5;
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				if(i==n/2+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
		
			
		}			
			for(int j=1;j<=st;j++) {
				System.out.print("*\t");
			}
			if(i<=n/2) {
				st++;
			}
				else {
					st--;
				}

			
			System.out.println();
		} */
//		Practice 18
	/*	int n=7;
		int st=n;
		int sp=0;
				for(int i=1;i<=n;i++) {
				for(int j=1;j<=sp;j++) {
					System.out.print("\t");
				}
				for(int j=1;j<=st;j++) {
					if(i>1 && i<=n/2 && j>1 && j<st) {
					System.out.print("\t");	
					}else {
					System.out.print("*\t");
				}
				}	
				if(i<=n/2) {
					sp++;
					st-=2;
					
				}else {
					sp--;
					st+=2;
				}
				System.out.println(); */
//		Pattern 19
	/*	int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(i==1) {
				if(j==n || j<=n/2+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}else if(i<=n/2) {
				if(j==n || j==n/2+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}else if(i==n/2+1) {
				System.out.print("*\t");
			}else if(i<n) {
				if(j==1 || j==n/2+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
				
			}else {
				
			}
			if(j==1 || j>=n/2+1) {
				System.out.print("*\t");
			}
			else {
				System.out.print("\t");
			}
				
			}
		}
			System.out.println(); */
//	Pattern 20
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n) {
					System.out.print("*\t");
				} else if(i>n/2 && (i==j || i+j==n+1)) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
					
						
					
					
					
					
					
					
					
					
					
					
					
					
				}
		
		
		
		
}
		

		
























