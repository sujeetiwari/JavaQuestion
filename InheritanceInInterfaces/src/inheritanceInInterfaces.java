interface sampleInterface{
	void meth1();
	void meth2();
}
interface childSampleInterface extends sampleInterface{ // can't implements
	void meth3();
	void meth4();
}
class MySampleClass implements childSampleInterface{ // we can't do extends
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
	public void meth3() {
		System.out.println("meth3");
	}
	public void meth4() {
		System.out.println("meth4");
	}
}

public class inheritanceInInterfaces {

	public static void main(String[] args) {
MySampleClass s=new MySampleClass();
s.meth1();
s.meth2();
s.meth3();
s.meth4();

	}

}
