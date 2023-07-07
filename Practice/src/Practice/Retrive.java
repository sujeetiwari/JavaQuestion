package Practice;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Retrive {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream i=new ObjectInputStream(new FileInputStream("f.text"));
		Employees e= (Employees)i.readObject();
		System.out.println(e.id +" "+e.name);
		i.close();
		

	}

}
