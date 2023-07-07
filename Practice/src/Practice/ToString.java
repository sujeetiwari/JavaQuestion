package Practice;

class Employee
{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
}
public class ToString {

	public static void main(String[] args) {
		Employee e1=new Employee(2,"Sujeet");
		System.out.println(e1.toString());

	}

}
