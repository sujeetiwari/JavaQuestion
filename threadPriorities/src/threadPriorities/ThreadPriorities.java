package threadPriorities;
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
	int i=34;
	System.out.println("Thankyou" +this.getName());
	}
}
public class ThreadPriorities {

	public static void main(String[] args) {
		MyThread t1=new MyThread("harry1");
		MyThread t2=new MyThread("harry2");
		MyThread t3=new MyThread("harry3");
		MyThread t4=new MyThread("harry4");
		MyThread t5=new MyThread("harry5(most important)");
t5.setPriority(Thread.MAX_PRIORITY);
		t1.start();
t2.start();
t3.start();
t4.start();
t5.start();

	}

}
