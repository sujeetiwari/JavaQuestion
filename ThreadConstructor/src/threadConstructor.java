
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
	int i=60;
	System.out.println("Thankyou");
//	while(true)
//	System.out.println("I am thread");
	}
}
public class threadConstructor {

	public static void main(String[] args) {
		MyThread t1=new MyThread("harry1");
		MyThread t2=new MyThread("Sujeet");
t1.start();
t2.start();
System.out.println("The id of the thread t is "+t1.getId());
System.out.println("THe name of the thread t is "+t1.getName());
System.out.println("The id of the thread t is "+t2.getId());
System.out.println("THe name of the thread t is "+t2.getName());

	}

}
