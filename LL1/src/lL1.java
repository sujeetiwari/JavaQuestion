import java.util.*;
public class lL1 {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.addFirst("am");
		list.addFirst("I");
		System.out.println(list);
        list.addLast("Sujeet");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i)+"->");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        
	}

}
