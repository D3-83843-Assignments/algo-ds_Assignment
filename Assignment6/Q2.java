
class Heap {
	private int arr[];
	private int SIZE;
	public Heap(int size) {
		 SIZE = 0;
		arr = new int[size + 1];
	}
	
	public void addHeap(int value) {
		//1. increase the SIZE of heap
		SIZE++;
		//2. add value at first empty location(index)
		arr[SIZE] = value;
		//3. adjust the position of newly added element with all its ancestros
		int ci = SIZE;
		int pi = ci / 2;
		while(pi >= 1) {
			//3.1 stop if child is less than parent
			if(arr[ci] > arr[pi])
				break;
			//3.2 swap parent and child if child is greater than parent
			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;
			//3.3 update child and parent indices
			ci = pi;
			pi = ci / 2;
		}
	}
	
	public int deleteHeap() {
		//1. take backup of maximum element (root element)
		int min = arr[1];
		//2. add last element of heap at first index (root position)
		arr[1] = arr[SIZE];
		//3. decreae the size of heap 
		SIZE--;
		//4. adjust the position of root element upto leap nodes
		int pi = 1;
		int ci = pi * 2;
		while(ci <= SIZE) {
			//4.1 find index of maximum child
			if((ci + 1) <= SIZE && arr[ci + 1] < arr[ci])
				ci = ci + 1;
			//4.2 if parent is greater than max child
			if(arr[pi] < arr[ci])
				break;
			//4.3 swap parent and max child if parent is less than max child
			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;
			//4.4 update child and parent indices
			pi = ci;
			ci = pi * 2;
		}
		
		// return maximum element (element to be deleted)
		return min;
	}
	
	public boolean isEmpty() {
		return SIZE == 0;
	}
	
	public boolean isFull() {
		return SIZE == arr.length-1;
	}
	
	public int getMin() {
		return arr[1];
	}

}


 class PriorityQueue {
	private Heap h;
	private final int pSIZE;
	public PriorityQueue(int size) {
		pSIZE = size;
		h = new Heap(pSIZE);
	}
	
	public void push(int value) {
		h.addHeap(value);
	}
	
	public int pop() {
		return h.deleteHeap();
	}
	
	public int peek() {
		return h.getMin();
	}
	
	public boolean isEmpty() {
		return h.isEmpty();
	}

	public boolean isFull() {
		return h.isFull();
	}
}

public class Q2 {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue(9);
		
		
		q.push(6);
		q.push(14);
		q.push(3);
		q.push(26);
		
		System.out.println("Peeked data : " + q.peek());
		System.out.println("Poped data : " + q.pop());
		System.out.println("Peeked data : " + q.peek());
	}

}

