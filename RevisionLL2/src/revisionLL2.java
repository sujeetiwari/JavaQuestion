import java.util.Iterator;
import java.util.LinkedList;



public class revisionLL2 {

	public static void main(String[] args) {
		LinkedList<Integer>list =new LinkedList<Integer> ();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(0, 0);
//list.remove(3);
//list.remove(2);
System.out.println( "List : "+list);
for(int element:list) {
	System.out.println(element);
}
Iterator r=list.descendingIterator();
System.out.println(" Reverse Order : ");
while(r.hasNext()) {
	System.out.println( " " + r.next());
}
System.out.println("Iterator with first element :");
Iterator l=list.listIterator(1);
while(l.hasNext()) {
	System.out.println( " " +l.next());
}
	}

}
