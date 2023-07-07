class base{
	int x;
	public void printMe() {
		System.out.println("I am in base class");
	}
public void setX(int X) {
	this.x=X;
	
		
	}
public int getX() {
	return x;
}
}
class derived extends base {
int y;
public void setY(int Y) {
	this.y=Y;
}
public int getY() {
	return y;
}
}

public class PracticeOops {

	public static void main(String[] args) {
//	base b=new base() ;
	derived d=new derived();
//	base d=new derived(); 
	d.setX(12);
	d.setY(13);
	System.out.println(d.getX());
	System.out.println(d.getY());
	d.printMe();
	}

}
