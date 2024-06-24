import java.util.Scanner;;
class queue{
	private int rear,front;
	private int arr[];
	private final int SIZE;
	public queue(int size)
	{
		SIZE=size;
		arr=new int [SIZE];
		front=rear=0;
	}

	public boolean  isEmpty()
	{
		return(rear==front);
	}
	public boolean isfull()
	{
		return(rear==SIZE-1);
	}

	public void push(int value)
	{
		if(isfull())
		{
			System.out.println("queue is full");
		}
		else{
			rear++;;
			arr[rear]=value;

		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return -1;
		}
		else{
		int val=arr[front+1];
		front++;
		return val;
		}
		
	}
	
	public int peek()
	{
		return arr[front+1];
	}
}

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q=new queue(6);
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		q.push(60);
		System.out.println(q.peek());
		System.out.println("before pop");
		System.out.println(q.pop());
		System.out.println("After pop");
		System.out.println(q.peek());


	}

}
