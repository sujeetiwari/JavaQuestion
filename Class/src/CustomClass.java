 class Employee{
	int id;
	int salary;
	String name;
	public void printDetails() {
		System.out.println("My id is " +id);
		System.out.println("and my name is "+ name);
	}
	public int getSalary(){
		return salary;
	}
}
public class CustomClass {

	public static void main(String[] args) {
      System.out.println("This is our custom class");
     Employee harry=new Employee();
     Employee john=new Employee();
     john.id=13;
     john.name="saksham";
     john.salary=5000;
     harry.id=12;
     harry.name="CodeWithSujeet";
     harry.salary=8000;
//     System.out.println(harry.id);
//     System.out.println(harry.name);
     harry.printDetails();
     john.printDetails();
     int salary=john.getSalary();
     System.out.println(salary);
	}

}
