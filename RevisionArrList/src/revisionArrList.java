import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class revisionArrList {

	public static void main(String[] args) {
		ArrayList<String>arr= new ArrayList<String>();
arr.add("red");
arr.add("yellow");
arr.add("green");
//arr.add("white");
//arr.add("pink");
System.out.println(arr);
//iterate
for( String element:arr) {
	
System.out.println(element);
}
// first element
arr.add(0,"orange");
System.out.println(arr);
// retrive the first and third element
String element=arr.get(0);
System.out.println("First element :"+element);
String element1=arr.get(2);
System.out.println("Third Element :" + element1);
//update=set
arr.set(2, "black");
System.out.println(arr);
//search =contains
if(arr.contains("Red")) {
	System.out.println("Found the Element");
}else {
	System.out.println("Not found the element");
}
// sort=collections.sort()
System.out.println("List the before sort :" +arr);
Collections.sort(arr);
System.out.println(arr);
// copy list
//ArrayList<String>arr1=new ArrayList<String>();
//arr1.add("A");
//arr1.add("B");
//arr1.add("C");
//arr1.add("D");
//System.out.println("List 1 :"+arr);
//System.out.println("List 2:"+arr1);
//Collections.copy(arr, arr1);
//System.out.println("Copy list to list 2,\n After copy");
////System.out.println("List 1 :"+arr);
//System.out.println("List 2 :"+arr1);
//Shuffle
System.out.println("List :" +arr);
Collections.shuffle(arr);
System.out.println(arr);
//reverse
Collections.reverse(arr);
System.out.println(arr);
List<String>List_Strings=new ArrayList<String>();
List_Strings.add("A");
List_Strings.add("A1");
List_Strings.add("A3");
List_Strings.add("A2");
List_Strings.add("A4");

//Extract a position
List<String> sub_list=List_Strings.subList(0, 3);
System.out.println("List of first three elements : "+sub_list);



























	}

}
