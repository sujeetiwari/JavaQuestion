import java.util.Scanner;
public class Function {
	public static void display(int n,int r,int npr) {
		System.out.println(n +"P" + r + "="+npr);
	
		
	}
   public static int fact(int x) {
	   int rv=1;
	   for(int i=1;i<=x;i++) {
	   rv=rv*i;
	   }
	   return rv;
   }
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=7;
	int r=3;
	int nfact=fact(n);	
	int nmrfact=fact(n-r);
	
	int npr=nfact/nmrfact;
	display(n,r,npr);
	}

}
