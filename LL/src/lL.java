class lL {
	Node head;
	private int size;
	lL(){
		this.size=0;
	}
class Node{
	String data;
	Node next;
	
	Node(String data){
		this.data=data;
		this.next=null;
		size++;
	}
}
//add=first or last
public void addFirst(String data) {
	Node newNode=new Node(data);
//	lL.Node head = null;
	
	if(head==null) {
		head=newNode;
		return;
	}
	newNode.next=head;
	head=newNode;
}
public void addLast(String data) {
	Node newNode=new Node(data);
	if(head==null) {
		head = newNode;
		System.out.println("List is empty");
		return;
		
	}
	Node lastNode=head;
	while(lastNode.next!=null) {
		lastNode=lastNode.next;
	
	}
		lastNode.next=newNode;
//	System.out.println("Null");
}

public void printList() {
	Node currNode=head;
	while(currNode!=null) {
		System.out.print(currNode.data+" ->");
		currNode=currNode.next;
	}
	System.out.println("Null");
}
//delete first
public void deleteFirst() {
	if(head==null) {
		System.out.println("This list is empty");
		return;
	}
	size--;
	head=head.next;
}
//delete last
public void deleteLast() {
	if(head==null) {
		System.out.println("This list is empty");
		return;
	}
	size--;
	if(head.next==null) {
		head=null;
		return;
	}
	Node secondLast=head;
	Node lastNode=head.next;//head.next=null->last node
	while(lastNode.next!=null) {
		lastNode=lastNode.next;
		secondLast=secondLast.next;
}
	secondLast.next=null;
}
public int getSize() {
	return size;
}
public void reverseIterate() {
	if(head==null || head.next==null) {
		return;
	}
	Node prevNode=head;
	Node currNode=head.next;
	while(currNode!=null) {
		Node nextNode=currNode.next;
		currNode.next=prevNode;
		//update
		prevNode=currNode;
		currNode=nextNode;
	}
	head.next=null;
	head=prevNode;
}
public Node reverseRecursive(Node head) {
	if(head==null || head.next==null) {
		return head;
	}
	Node newHead= reverseRecursive(head.next);
	head.next.next=head;
	head.next=null;
	return newHead;
}

	public static void main(String[] args) {
lL List=new lL();
List.addFirst("Linked list");
List.addFirst("a");
List.addFirst("This");

List.printList();
List.addFirst("is");
List.printList();
List.deleteFirst();
List.printList();
List.deleteLast();
List.printList();
List.getSize();
System.out.println(List.getSize());
List.addFirst("sujeet");
System.out.println(List.getSize());
//List.reverseIterate();
//List.printList();
List.head=List.reverseRecursive(List.head);
List.printList();
	}

}



