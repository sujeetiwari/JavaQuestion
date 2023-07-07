class C1{
	public int x=5;
	protected int y=6;
	int z=7;
	private int a=8 ; 
	public void meth1() {
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(a);	
	}
}
	class C2 extends C1{
		
		public void meth2() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
//		System.out.println(a);	
		}
	}
	

public class accessModifiers {

	public static void main(String[] args) {
		C1 c=new C1();
		c.meth1();
//         System.out.println(c.x); //only a- protected is not run when we are in same package
         C2 C =new C2();
         C.meth2();
//         System.out.println(C.y);
	}

}
