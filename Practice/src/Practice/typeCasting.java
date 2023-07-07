package Practice;

public class typeCasting {

	public static void main(String[] args) {
		
		//NarrowCasting =downcasting  large to small
		
		double a=3.13;
		int b=(int)a;
		System.out.println("Narrrow Casting :"+b);
		
		//widening casting=upcasting  small to large
		double c=b;
		System.out.println("Widening Casting"+c);

		// String to num
		
		String num="123";
		int n=Integer.parseInt(num);
		System.out.println(n+5);
		
		int i=20;
		String s=Integer.toString(i);
		String v=s.valueOf(i);
		System.out.println(s);
		System.out.println(v);
		
		
	}

}
