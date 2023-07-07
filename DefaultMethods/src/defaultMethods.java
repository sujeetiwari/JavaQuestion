interface camera{
	void takeSnap() ;
		void recordVideo();
//		void record4kVideo();
		private void greet() {
			System.out.println("Good Morning");
		}
		default void record4kVideo() {
			greet();
			System.out.println("Recording in 4k.....");
		}
}
interface wifi{
	String[] getNetworks();
	void connectionNetworks(String network);
	
}
class MyCellPhone{
	void callNumber(int phoneNumber) {
		System.out.println("calling" + phoneNumber);
	}
	void pickCall() {
		System.out.println("Connecting...");
	}
}
	class smartPhone extends MyCellPhone implements wifi, camera{
			
	 public void takeSnap() {
		System.out.println("Taking snap");
	}
	 public void recordVideo() {
		System.out.println("Taking video");
	}
	 public String[] getNetworks() {
		 System.out.println("Getting list of networks");
		 String[] networkList= {"Harry","Sujeet","Ayush"};
		 return networkList;
	 }
	 }

public class defaultMethods {

	public static void main(String[] args) {
	smartPhone sp=new smartPhone();
	sp.record4kVideo();
	String[] ar=sp.getNetworks();
	for(String item:ar) {
		System.out.println(item);
	}

	}
}

