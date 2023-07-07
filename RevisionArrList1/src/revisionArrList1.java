import java.util.ArrayList;
import java.util.Collections;

public class revisionArrList1 {

	public static void main(String[] args) {
		ArrayList<String>arr= new ArrayList<String>();
		//Compare two arraylist
		arr.add("red");
		arr.add("yellow");
		arr.add("green");
		arr.add("white");
		arr.add("pink");
		for(String element:arr) {
			
			System.out.println("Before :" +element);
		}
		Collections.swap(arr, 0, 3);
		for(String b:arr) {
			
			System.out.println("after : " +b);
		}
		ArrayList<String>arr1= new ArrayList<String>();
		arr1.add("red");
		arr1.add("orange");
		arr1.add("green");
		arr1.add("black");
		arr1.add("pink");
		System.out.println(arr1);
		ArrayList<String>arr2=new ArrayList<String>();
//		for(String e:arr) 
//			arr2.add(arr1.contains(e)? "Yes":"No");
//			System.out.println(arr2);
		//join two array
		arr2.addAll(arr);
		arr2.addAll(arr1);
		System.out.println(arr2);
		
		//clone the array
		ArrayList<String>a= new ArrayList<String>();
		a.add("red");
		a.add("yellow");
		a.add("white");
		System.out.println( "Original ArrayList" +a);
		a.ensureCapacity(6);
		a.add("pink");
		a.add("green");
		a.add("purple");
//		a.add("e")
		System.out.println("NEW Array "+a);
		a.trimToSize();
		System.out.println(a);
		int c=a.size();
		System.out.println(c);
//		ArrayList<String>b=(ArrayList<String>)a.clone();
//		System.out.println("Cloned Arraylist"+b);
//		// checking remove
//		System.out.println("Original ArrayList"+a);
////		System.out.println();
//		a.removeAll(a);
//		System.out.println("After remove " +a.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}


