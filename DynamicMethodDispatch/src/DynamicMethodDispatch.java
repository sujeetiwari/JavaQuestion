class One{
	public void greet() {
		System.out.println("Good Morning");
	}
	public void name() {
		System.out.println("My name is java");
	}
}
class Two extends One{
	public void welcome() {
		System.out.println("Welcome to my home");
	}
	public void name() {
		System.out.println("My name is java class two");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		One obj=new Two(); // dispatch 
		obj.greet();
		obj.name();
        
        Two obj2=new Two();
        obj2.welcome();
     obj2.name();
	
	}

}
