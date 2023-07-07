import java.util.ArrayList;
import java.util.Scanner;
class MyGeneric<T1,T2>{
	int val;
	private T1 t1;
	private T2 t2;
	public MyGeneric(int val,T1 t1, T2 t2) {
		this.val=val;
		this.t1=t1;
		this.t2=t2;
	}
	public T2 getT2() {
		return t2;
	}
	public void setT2(T2 t2) {
		this.t2=t2;
	}
	public int getVal() {
		return val;
	}
	public int setVal() {
		return val;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1=t1;
	}
	
	
}

public class generics {

	public static void main(String[] args) {
//		ArrayList<Integer> arraylist=new ArrayList<>();
//arraylist.add(12);
//arraylist.add(35);
//arraylist.add(23);
////arraylist.add(new Scanner(System.in));
//int a=arraylist.get(2);
//System.out.println(a);
MyGeneric<String,Integer>g=new MyGeneric(23,"My string is my string",45);
String str=g.getT1();
Integer int1=g.getT2();
System.out.println(str+int1);
	}

}
