abstract class Pen{
	abstract void write();
	abstract void refill();
}
class fountainPen extends Pen{
	void write() {
		System.out.println("complete your home work");
	}
	void refill() {
		System.out.println("fill a refiill");
	}
}
class Monkey{
	void jump() {
		System.out.println("juming...");
	}
	void bite() {
		System.out.println("bite....");
	}
}
interface BasicAnimal{
	void eat() ;
	void sleep();
	
	}
	class Human extends Monkey implements BasicAnimal{
		void speak() {
			System.out.println("Speakig...");
		}
public	void eat() {
		System.out.println("eating....");
	}
public	void sleep() {
		System.out.println("sleeping...");
	}
}
public class abstractClassPractice {

	public static void main(String[] args) {
		
fountainPen p=new fountainPen();
p.write();
p.refill();
Human h=new Human();
h.eat();
h.sleep();
//polymorphism
BasicAnimal b=new Human();
b.eat();
b.sleep();
//b.speak(); this is not a reference of basic animal ..it is a object of human
Monkey m=new Human();
m.bite();
//m.eat();
	}

}
