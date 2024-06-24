import List.Node;

public class SLL {

	public static void main(String[] args) {
		List list = new List();
		
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		
		list.display();

	}

}

class List {

	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public List() {
		head = null;
	}
	
	public boolean IsEmpty() {
		return head == null;
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List :: ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		System.out.println("");
	}

	
	public void addFirst(int value) {
		Node newnode = new Node(value);		
		newnode.next = head;
		head = newnode;
	}
	
	public void rev()
	{
		Node trav = head;
		Node pos = head;
		
		while
			()
		{
			
		}
	}
}
