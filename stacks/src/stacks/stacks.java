package stacks;

import java.util.Stack;

public class stacks {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();	
	    st.push(10);
	    st.push(20);
	    st.push(30);
	    System.out.println(st);
	    st.push(40);
	    st.push(50);
	    System.out.println(st); 
	    System.out.println(st.peek() + " " + st.size());
		st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st +" -> " + st.peek() + st.size());
	}

}
