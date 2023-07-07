package oopsPractice1;
class Address{
	String house_no;
	String city;
	String state;
	String country;
	Address(String house_no,String city,String state,String country){
		this.house_no=house_no;
		this.city=city;
		this.state=state;
		this.country=country;
	}
}


public class Employee {
	int id;
	String name;
	int salary;
	Address address;
	Employee(int id,String name,int salary,Address address){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	void display() {
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("House No :"+address.house_no);
		System.out.println("City :"+address.city);
		System.out.println("State :"+address.state);
		System.out.println("Country :"+address.country);
	}

	public static void main(String[] args) {
		Address a=new Address(" TIWARI-123","Gurgaon","Haryana","India");
		Employee e=new Employee(1,"Sujeet Tiwari",50000,a);
		e.display();

	}

}
