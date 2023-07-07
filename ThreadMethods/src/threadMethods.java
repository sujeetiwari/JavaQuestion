class MyThreadNew extends Thread{
//	public MyThreadNew(String name) {
//		super(name);
//	}
	public void run() {
	int i=0;
	while(true) {
		try {
			Thread.sleep(45);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	System.out.println("I am thread");
	System.out.println("Thankyou");
	i++;
	}
}

}
class MyThreadNew1 extends Thread{
	
		public void run() {
		int i=0;
		while(i<9) {
			System.out.println("I am thread 2");
		System.out.println("Thankyou sujeet");
		}
		i++;
	}
}
public class threadMethods {

	public static void main(String[] args) {
		MyThreadNew t1= new MyThreadNew();
		MyThreadNew1 t2=new MyThreadNew1();
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
		t2.start();

	}

}
