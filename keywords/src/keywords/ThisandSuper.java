package keywords;
class EkClass{
	 int a;
	 public int getA() {
		 return a;
	 }
	 EkClass(int A){
		this.a=A; //this is a reference
	 }
	 public int returnone() {
		 return 1;
	 }
	}
class DoClass extends EkClass{
	DoClass(int c){
	super( c);
		System.out.println("i am constructor");
	}
}
public class ThisandSuper {

	public static void main(String[] args) {
	EkClass e=new EkClass(56);
	DoClass d=new DoClass(7);
	System.out.println(d.getA());
System.out.println(e.getA());
	}

}
