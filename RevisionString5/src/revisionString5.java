import java.util.Stack;

public class revisionString5 {
	public boolean isValid(String s) {
		Stack<String>stack=new Stack<>();
		for(char c:s.toCharArray()) {
			if(c=='('|| c=='['|| c=='{') {
				stack.add(c);
			}else {
				if(stack.isEmpty())
					return false;
				if(c==']'&& stack.peek()!='[')
					return false;
				if(c==')'&& stack.peek()!='(')
					return false;
				if(c=='}'&& stack.peek()!='{')
					return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
