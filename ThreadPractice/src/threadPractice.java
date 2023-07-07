class  Practice13 extends Thread{
	public void run() {
		while(true) {
	
	System.out.println("I am THread");
	System.out.println("Thanku");
}

	}
}
class  Practice1 extends Thread{
	public void run() {
//		while(true) {
//	try {
//		Thread.sleep(200);
//	}catch(Exception e){
//		System.out.println(e);
//	}
//	System.out.println("I am Thread 1");
//	System.out.println("Welcome");
//		}
	}
}
 public class threadPractice {

	public static void main(String[] args) {
		Practice13 p=new Practice13();
		Practice1 P=new Practice1();
//		p.setPriority(6);
//		P.setPriority(9);
		System.out.println(p.getPriority());
		System.out.println(P.getPriority());
		System.out.println(p.getState());
		System.out.println(P.getState());
		System.out.println(Thread.currentThread().getState());
//p.start();
P.start();
	}

}
