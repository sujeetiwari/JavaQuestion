class base{
	base(){
		System.out.println("I am a constructor");
	}
	base(int x){
		
		System.out.println("I am an overloaded  constructor with the value of a as : " +x);
	}
	public int x;
	public int getX() {
		return x;
	}
	public void setX(int X) {
		this.x=X;
	}
	
}
class derived extends base{
	
	derived(){
		System.out.println("I am a derived class constructor");
	}
	derived(int x,int y){
		super(y);
		System.out.println("I am an overloaded constructor of derived with the value of y as:" +y);
	}
	
}
class  ChildOfDerived  extends base {
	
	ChildOfDerived(){
	System.out.println("I am a child of derived class constructor");
}
ChildOfDerived(int x,int y,int z){
	
	super(x);
	System.out.println("i am an overloaded constructor of derived with the value of z as :" +z);
}
}
public class ConstructorInheriatance {

	public static void main(String[] args) {
//		base b =new base();
//		derived d=new derived(4,7);
        ChildOfDerived cd=new ChildOfDerived(6,9,2);
	}

}
