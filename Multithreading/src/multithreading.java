class MyThread extends Thread{
	public void run() {
		int i=0;
		while(i<40)
		{
			System.out.println("My thread is Running");
			System.out.println("I am happy");
			i++;
			}
		
		}
}
class MyThread2 extends Thread{
	public void run() {
		int i=0;
		while(i<20)
		{
			System.out.println("My thread 2 is Running");
			System.out.println("I am sad");
			i++;
			}
		
		}
}
public class multithreading {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		MyThread2 t2=new MyThread2();
		t.start();
		t2.start();
//		t.stop();
//		func1();
//		func2();
		

	}
		
}
