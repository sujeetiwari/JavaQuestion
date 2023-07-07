package Practice;

import java.util.ArrayList;

public class ToArray {

	public static void main(String[] args) {
		
		ArrayList<String>a=new ArrayList<String>();
		a.add("My");
		a.add("name is");
		a.add("Sujeet Tiwari");
		System.out.println("List :");
	for(String value:a) {
			System.out.print(value+" ");
			
		}
	System.out.println();
	System.out.println("Array :");
		Object[]ob=a.toArray();
		for(Object o:ob) {
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.println("Character Array :");
		String name="Sujeet";
		char []c=name.toCharArray();
		for(char value:c) {
			System.out.println(value);
		}
		
		
		
	}

}
