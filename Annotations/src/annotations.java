class Phone{
	public void showTime() {
		System.out.println("The time is 8 am");
	}
}
class NewPhone extends Phone {
	public void showTime() {
		System.out.println("The time is 8 PM");
	}
//	@Deprecated
	public int sum(int a,int b) {
		return a+b;
		
	}
}
public class annotations {
//@SuppressWarnings("deprecation ")
	public static void main(String[] args) {
		NewPhone  phone=new NewPhone();
		phone.showTime();
phone.sum(2, 6);
	}

}
