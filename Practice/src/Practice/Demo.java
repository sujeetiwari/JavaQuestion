package Practice;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employees implements Serializable{
	transient int id;
	String name;
	Employees(int id,String name){
		this.id=id;
		this.name=name;
		
	}
}
public class Demo {

	public static void main(String[] args) throws IOException {
		
		Employees e=new Employees(121,"Sujeet");
		FileOutputStream f=new FileOutputStream("f.text");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(e);
		o.close();
		f.close();
		System.out.println("Employee object Saved Successfully");
	

	}

}
