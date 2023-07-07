package constructor;
class Students1 {
	public String name;
	
	Students1(String n){
		name=n;
		
	}
	public String toString() {
		String words[]=name.split("\\s");
		String toggle="";
		for(String w:words) {
			String first=w.substring(0,1);
			String last=w.substring(1);
			toggle+=first.toLowerCase()+last.toUpperCase()+"";
		}
		
		return toggle.trim();
	}
}
public class constructorToggle {

	public static void main(String[] args) {
		Students1 sb=new Students1("Deepanshu");
		System.out.println(sb);
	

	}

}
