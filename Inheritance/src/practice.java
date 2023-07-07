class Employee{
	String name;
	int id;
	int salary;
	Employee(String name,int id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("Salary :"+salary);
	}
}
class Trainer extends Employee{
	int student;
	int placement_stud;
	Trainer(String name,int id,int salary,int student,int placement_stud){
		super(name,id,salary);
		this.student=student;
		this.placement_stud=placement_stud;
	}
	void TrainerInfo() {
		System.out.println("Student :"+student);
		System.out.println("Placement Student :"+placement_stud);
	}
}
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t=new Trainer("Sujeet",12,12000,20,32);
		t.display();
		t.TrainerInfo();

	}

}
