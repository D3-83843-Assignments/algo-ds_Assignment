
public class SLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l= new List();
		
		l.addFirst(1);
		l.addFirst(2);
		l.addFirst(3);
		l.addFirst(4);
		
		l.addBeforeNode(5, 3);
		l.addAfterNode(6, 2);
		
		l.display();
	}

}

class List
{
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
		//1. create trav and start at head
		Node trav = head;
		System.out.print("List :: ");
		while(trav != null) {
			//2. visit/print data of current node (trav.data)
			System.out.print(" " + trav.data);
			//3. go on next node (trav.next)
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node of list
		System.out.println("");
	}

	
	public void addFirst(int value) {
		Node newnode = new Node(value);		
		newnode.next = head;
		head = newnode;
	}
	
	public void addBeforeNode(int newvalue, int nodeval)
	{
		Node newnode = new Node(newvalue);
		
		Node trav = head;
		while(trav.next.data!=nodeval)
		{
			trav=trav.next;
		}
		newnode.next=trav.next;
		trav.next=newnode;
	}
	
	public void addAfterNode(int newvalue, int nodeval)
	{
		Node newnode = new Node(newvalue);
		
		Node trav = head;
		while(trav.data!=nodeval)
		{
			trav=trav.next;
		}
		newnode.next=trav.next;
		trav.next=newnode;
	}

}