package constructor;
class Student{
	private String name;
	private int marks;
	Student(String n,int m){
		name=n;
		marks=m;
	}
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Marks :"+marks);
	}
	
}
	public class constructorJava {
	public static void main(String[] args) {
		Student sb=new Student("Deepanshu",89);
		sb.display();

	}

}
