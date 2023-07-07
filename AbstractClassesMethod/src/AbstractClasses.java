abstract class Parent{  // abstract means khayali pulavoo...like thought in mind
public  Parent(){
	System.out.println("I am constructor");
}
public void sayHello() {
	System.out.println("Hello");
}
 abstract  public  void greet();
 abstract public void greet2(); 	
}
class Child extends Parent{
	public void greet() {
		System.out.println("Good Morning");
	}
	public void greet2() {
		System.out.println("Good Afternoon");
	}
}
abstract class Child2 extends Parent{
	public void th() {
		System.out.println("I am good");
	}
}
public class AbstractClasses {

	public static void main(String[] args) {
//		Parent p=new Parent();  // abstract class ka object nahi bna skte
		Child c=new Child();
c.greet();
c.greet2();
	}

}
