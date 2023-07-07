package labClass5;

import java.io.*;


public class inoutexception {
	public static void findFile() throws IOException{
		File f=new File("sujeet.txt");
			FileInputStream stream=new FileInputStream(f);
	}

	public static void main(String[] args) {
		try {
			findFile();
		}
		catch(IOException e) {
			System.out.println("Exception occured  : " +e);
		}
		
	}

}
