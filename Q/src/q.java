import java.util.*;

public class q {
static class Queue{
	static Stack<Integer>s1=new Stack<>();
	static Stack<Integer>s2=new Stack<>();
	public static boolean isEmpty() {
		return s1.isEmpty();
	}
	public static void add(int data) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(data);
		if(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public static int remove() {
		if(isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		return s1.pop();
	}
	public static int peek() {
		if(isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		return s1.peek();
	}
}
	public static void main(String[] args) {
//		Queue <Integer>q1=new LinkedList<>(); //both are same dequeue and linkedlist
//		Queue <Integer>q1=new ArrayDeque<>();
		Queue q1=new Queue();
		q1.add(1);
		q1.add(2);;
		q1.add(3);
		q1.add(4);
		q1.add(5);
		while(!q1.isEmpty()) {
			System.out.println(q1.peek());
			q1.remove();
		}


	}

	}
