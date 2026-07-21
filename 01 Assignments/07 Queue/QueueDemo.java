class Queue {
    int front, rear, size;
    int capacity;
    int[] arr;

    // Constructor
    Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        size = 0;
        rear = capacity - 1;
        arr = new int[capacity];
    }

    // Check if queue is full
    boolean isFull() {
        return (size == capacity);
    }

    // Check if queue is empty
    boolean isEmpty() {
        return (size == 0);
    }

    // Enqueue (Insert element)
    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
        System.out.println(item + " inserted into queue");
    }

    // Dequeue (Remove element)
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Get front element
    int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Get rear element
    int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[rear];
    }
}

// Main class
public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front: " + q.getFront());
        System.out.println("Rear: " + q.getRear());
    }
}