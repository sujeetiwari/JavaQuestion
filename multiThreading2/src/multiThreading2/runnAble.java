package multiThreading2;
class MyThreadRunnable1 implements Runnable{
	public void run() {
		int i=0;
		while(i<20) 
		System.out.println("I am a thread 1 not a thread");
		i++;
		}
	}

class MyThreadRunnable2 implements Runnable{
	public void run() {
		int i=0;
		while(i<30) {
	
		System.out.println("I am a thread 2 not a thread 1");
		i++;
	}
}

}
public class runnAble {

	public static void main(String[] args) {
//	MyThreadRunnable1 t=new MyThreadRunnable1();
//	MyThreadRunnable2 t2=new MyThreadRunnable2()
		MyThreadRunnable1 bullet=new MyThreadRunnable1();
		Thread gun1=new Thread(bullet);
		MyThreadRunnable2 bullet2=new MyThreadRunnable2();
		Thread gun2=new Thread (bullet2);
	gun1.run();
	gun2.run();
	

	}

}
