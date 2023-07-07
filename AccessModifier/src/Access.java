class MyEmployee{
private	int id;
private	String name;
public String getName() {
	return name;
}
	public void setName(String n) {
		name=n;
	}
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
}
public class Access {

	public static void main(String[] args) {
	MyEmployee sujeet=new MyEmployee();
//	Sujeet.id=45;
//	Sujeet.name="Sujeet"; throws an error due to private access modifier
	
	sujeet.setName("codewithsujeet");
	System.out.println(sujeet.getName());
	sujeet.setId(7);
System.out.println(sujeet.getId());
	}

}
// one program for circle