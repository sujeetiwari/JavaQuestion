interface Bicycle{
//	int a=15;
	void applyBrake(int decreement) ;
		void speedUp(int increement);
	}
interface HornBicycle{
//	int a=15;
	void Blownhorn();
		void Omfoh();
	}
class Avon implements Bicycle,HornBicycle{
int a=3;// we can override in class but not in object
public 	void blowHorn() {
		System.out.println("pee pee poo poo");
	}
	public void applyBrake(int decreement) {
		System.out.println("Applying Brake");
	}
	public void speedUp(int increement) { // public is defautlt ..without write public we can do
		System.out.println("Applying SpeedUp");
	}
public	void BlowHorn() {
		System.out.println("Kabhi khushi kabhi gum pee poo pee");
	}
	public void omfoh() {
		System.out.println("Omfoh");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		
 Avon cycleSujeet=new Avon();
 cycleSujeet.applyBrake(1);
 cycleSujeet.speedUp(0);
 cycleSujeet.blowHorn();
 cycleSujeet.BlowHorn();
 cycleSujeet.omfoh();
 System.out.println(cycleSujeet.a);
// we can use more than one interfaces but we can't use more than abstract class
	}

}
