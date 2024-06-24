public class q8 {
    private int SIZE;
    private int front, rear, count;
    private int[] queue;

    // Constructor to initialize the queue
    public q8(int size) {
        this.SIZE = size;
        this.queue = new int[SIZE];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return count == SIZE;
    }

    // Enqueue an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % SIZE;
        queue[rear] = value;
        count++;
    }

    // Dequeue an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % SIZE;
        count--;
        return value;
    }

    // Peek at the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek");
            return -1;
        }
        return queue[front];
    }

    // Get the size of the queue
    public int size() {
        return count;
    }

    // Print the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % SIZE] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        q8 queue = new q8(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Queue after enqueuing 5 elements:");
        queue.printQueue();

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is: " + queue.size());

        System.out.println("Dequeued element is: " + queue.dequeue());
        System.out.println("Queue after dequeuing an element:");
        queue.printQueue();

        System.out.println("Queue size is: " + queue.size());
    }
}
