
public class SCLL {

	public static void main(String[] args) {
		
		List list = new List();
		
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		
		list.addLast(4);
		
		list.addFirst(5);
		
		list.deleteFirst();
		list.deleteLast();
		
		list.addAtPos(5, 3);
		list.addAtPos(6, 1);
		
		list.display();
	}

}


class List {

	static class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}
	
	private Node tail;
	private int count;
	
	public List()
	{
		tail=null;
		count=0;
	}
	
	public void display()
	{
		Node trav = tail;
		do
		{
			trav=trav.next;
			System.out.print(" "+trav.data);
		}
		while(trav!=tail);
		System.out.println("\nCount = "+count);
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		
		if(tail==null)
		{
			tail=newnode;
			newnode.next=newnode;
		}
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
		}
		count++;
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(tail==null)
		{
			tail=newnode;
			newnode.next=newnode;
		}
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
		count++;
	}
	
	public void deleteFirst()
	{
		if(tail==null)
		{
			System.out.println("Nothing to delete..");
		}
		else if(count==1)
		{
			tail=null;
		}
		else
		{
			tail.next=tail.next.next;
		}
		count--;
	}
	
	public void deleteLast()
	{
		if(tail==null)
		{
			System.out.println("Nothing to delete..");
		}
		else if(count==1)
		{
			tail=null;
		}
		else
		{
			Node trav = tail;
			do
			{
				trav=trav.next;
			}
			while(trav.next!=tail);
			trav.next=tail.next;
			tail=trav;
		}
		count--;
	}
	
	public void addAtPos(int value, int pos)
	{
		Node newnode = new Node(value);

		if(tail==null)
		{
			tail=newnode;
			newnode.next=newnode;
		}
		else if(pos<=1)
		{
			addFirst(value);
			count--;
		}
		else if(pos>=count)
		{
			addLast(value);
			count--;
		}
		else
		{
			Node trav = tail.next;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}
			newnode.next=trav.next;
			trav.next=newnode;
		}
		count++;
	}
}


