import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {

	public static void main(String[] args) {
//		File myfile=new File("sujeet.java");
//		try {
//			
//			myfile.createNewFile();
//		} catch(IOException e) {
//			System.out.println("Unable to create this file");
//			e.printStackTrace();
//		}
try {
	FileWriter filewriter =new FileWriter("helloworld.java");
	filewriter.write("This is our first file from java course");
	filewriter.close();
}
catch(IOException e) {
	e.printStackTrace();
}
	}

}
