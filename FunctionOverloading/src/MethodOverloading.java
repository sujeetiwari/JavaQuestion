
public class MethodOverloading {
static void foo() {
	System.out.println("Good Morning Sujeet");
}
static void foo(int a) {
	System.out.println("Good Morning " + a + "bro!");
}
static void foo(int a,int b) {
	System.out.println("Good Evening" + a + "Tiwari !");
}
	public static void main(String[] args) {
		foo();
		foo(7);
		foo(9);

	}

}
