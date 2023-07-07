package lambdaExpression;
@FunctionalInterface //means only one method
	interface DemoAno{
		void meth1(int a);
}
//class HarryFunc implements DemoAno{
//	public void meth1() {
//		System.out.println("This is a meth1");
//	}
//}
//		void meth1();
//		void meth2();
//	}
//class AnonyDemo implements DemoAno{
//	public void display(){
//		System.out.println("Hello");
//	}
//	public void meth1() {
//	System.out.println("this is a meth1");	
//	}
//	public void meth2() {
//	
//	}
//}
public class lambdaExpression {
	public static void main(String[] args) {
		
//DemoAno an=new AnonyDemo(); 
//an.meth1();
//DemoAno da=new DemoAno() { //anonymous declare as same time or initiate
//	public void meth1() {
//		System.out.println("I am meth 1");
//	}
//	public void meth2() {
//		System.out.println("I am meth2");
//	}
//};
//da.meth1();
//Lambda Expression
DemoAno obj=(a)->{System.out.println("I am method 1 from this lambda "+a);};
obj.meth1(6);

	}

}
