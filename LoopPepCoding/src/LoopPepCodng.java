import java.util.Scanner;
public class LoopPepCodng {

	public static void main(String[] args) {
		// Rotate a number
	/*	System.out.print("Enter a number :");
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(" The value of K :");
		int k=sc.nextInt();
		int temp=n;
		int nod=0;
		while(temp>0) {
			temp=temp/10;
			nod++;
		}
		
		k=k%nod;
		if(k<0) {
			k=k+nod;
		}
		int div=1;
		int mult=1;
		for(int i=1;i<=nod;i++) {
			if(i<=k) {
				div=div*10;
				
			}else {
				mult=mult*10;
			}
		}
		int q=n/div;
		int r=n%div;
		
		int rot =r*mult+q;
		System.out.println(rot);*/
//		GCD and LCM
//		Scanner sc=new Scanner(System.in);
/*		System.out.println("Enter a number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int on1=n1;
		int on2=n2;
		while(n1%n2!=0) {
			int rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		int gcd=n2;
		int lcm=(on1*on2)/gcd;
		System.out.println(gcd);
		System.out.println(lcm); */
		
//		Prime Factorization
		
	/*	System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int div=2;div*div<=n;div++) {
			while(n%div==0) {
				n=n/div;
				System.out.println(div);
			}
		}
		
		if(n!=1) {
			System.out.print(n);
		} */
//		 Pythagorean Triplets
	/*	System.out.print("Enter a number :");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=a;
		if(b>=max) {
			max=b;
		}
		 if(c>=max) {
			max=c;
		}
		if(max==a) {
			boolean flag=((b*b+c*c)==(a*a));
			System.out.println(flag);
		} else if(max==b) {
			boolean flag=((a*a+c*c) ==(b*b));
			System.out.println(flag);
		} else {
			boolean flag=((b*b+a*a)==(c*c));
			System.out.println(flag);
		} */
//	Benjamin Bulbs
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a bulb :");
		int n=sc.nextInt();
		for(int i=1;i*i<=n;i++) {
			System.out.println(i*i);
		} 
//		 Star Pattern
	/*	int n=9;
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
				System.out.print("* \t");
			}
			System.out.print("\n");
		} */
//		Pattern 2
	/*	int n=5;
		for(int i=n;i>=1;i--) {
			for( int j=1;j<=i;j++) {
				System.out.print("* \t");
			}
			System.out.println();
		} */
	
//	Patter 3
	/*	int n=5;
		int sp=n-1;
		int st=1;
		for(int i=1;i<=n;i++) {
//		System.out.print(sp + " , " + st);
		for(int j=1;j<=sp;j++) {
			System.out.print("\t");
		}
		for(int j=1;j<=st;j++) {
			System.out.print(" *\t");
		}
		sp--;
		st++;
		System.out.println();
		} */
//		Pattern 4
/*		int n=5;
	int	sp=0;
    int st=n;
    for(int i=1;i<=n;i++) {
    	for( int j=1;j<=sp;j++) {
    	System.out.print("\t");	
    	}
    	for(int j=1;j<=st;j++) {
    		System.out.print("*\t");
    	}
//    	System.out.print( sp + "," + st);
    	sp++;
    	st--;
    	System.out.println(); 
    }*/	
		
		
	}

}
