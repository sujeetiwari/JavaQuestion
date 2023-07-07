package oopsPractice1;
interface friends{
	void bestFriend() ;
			
}
class Dost implements friends{
	public void bestFriend() {
		System.out.println("Saurav");
	}
}
public class Test {

	public static void main(String[] args) {
		
		friends e=new Dost();
		e.bestFriend();

	}

}
