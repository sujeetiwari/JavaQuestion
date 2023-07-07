package oopsPractice;
class Person{
	String name;
	int id;
	int age;
	Person(String name,int id,int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
}
class Employee extends Person{
	int salary;
	Employee(String name,int id,int age,int salary){
		super(name,id,age);
		this.salary=salary;
	}
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
	}
}



public class practice {

	public static void main(String[] args) {
	Employee e=new Employee("Sujeet",1,21,50000);
	e.display();
				
	
	}

	}

