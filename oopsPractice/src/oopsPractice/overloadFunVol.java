package oopsPractice;

public class overloadFunVol {
//	double volume;
	static double volume(double r) {
		 double volume=1.33*3.14*r*r*r;
		 System.out.println("Volume of sphere :"+volume);
		 return volume;
	}
	static double volume(double h,double r) {
		double volume=3.14*r*r*h;
		System.out.println("Volume of rectangle :"+volume);
		return volume;
	}
	static double volume(double l,double b,double h) {
		double volume=l*b*h;
		System.out.println("Volume of area :"+volume);
		return volume;
	}
	public static void main(String[] args) {
		
		volume(2.5);
		volume(2,3);
		volume(1,2,3);

	}

}
