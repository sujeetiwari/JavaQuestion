import java.util.Iterator;
import java.util.LinkedList;

public class revisionLL {

	public static void main(String[] args) {
LinkedList<String>list=new LinkedList<String>();
list.add("Red");
list.add("Green");
list.add("Black");
list.add("white");
// append
System.out.println(list);
list.addFirst("pink");
System.out.println("Original list "+list);
list.add(0,"Orange");
list.addLast("Purple");
System.out.println(list);
list.offerFirst("Blue");
System.out.println(list);
Object first_element=list.getFirst();
Object last_element=list.getLast();
System.out.println("First :"+ list.getFirst());
System.out.println("Last :"+ list.getLast());

// iterate a list
//for(String element:list) {
//	System.out.println(element);
//}
// iterator for a first position
//Iterator l=list.listIterator(2);
//while(l.hasNext()) {
//	System.out.println(l.next());
//}
Iterator r=list.descendingIterator();
System.out.println("Elements in reverse order :");
while(r.hasNext()) {
	System.out.println(r.next());
}
	}

}
