class Queue {
    int maxSize;
    int[] queueArray;
    int front;
    int rear;

    Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow! Cannot insert " + value);
        } else {
            queueArray[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow! Cannot delete");
        } else {
            System.out.println(queueArray[front++] + " deleted from queue");
        }
    }

    void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + queueArray[front]);
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queueArray[i]);
            }
        }
    }
}

public class A7 {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.peek();

        q.dequeue();
        q.dequeue();

        q.display();
    }
}