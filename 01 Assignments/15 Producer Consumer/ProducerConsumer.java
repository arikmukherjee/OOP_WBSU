import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {
        // Create shared buffer
        Buffer buffer = new Buffer(5); // Buffer size of 5

        // Create producer and consumer threads
        Thread producer = new Thread(new Producer(buffer), "Producer");
        Thread consumer = new Thread(new Consumer(buffer), "Consumer");

        // Start threads
        producer.start();
        consumer.start();

        // Let them run for some time
        try {
            Thread.sleep(10000); // Run for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Stop the threads
        producer.interrupt();
        consumer.interrupt();

        System.out.println("\nProgram finished.");
    }
}

// Shared buffer class
class Buffer {
    private Queue<Integer> queue;
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    // Producer method - synchronized to ensure thread safety
    public synchronized void produce(int item) throws InterruptedException {
        // Wait if buffer is full
        while (queue.size() == capacity) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait();
        }

        // Add item to buffer
        queue.add(item);
        System.out.println("Produced: " + item + " (Buffer size: " + queue.size() + ")");

        // Notify consumer that item is available
        notify();
    }

    // Consumer method - synchronized to ensure thread safety
    public synchronized int consume() throws InterruptedException {
        // Wait if buffer is empty
        while (queue.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();
        }

        // Remove item from buffer
        int item = queue.remove();
        System.out.println("Consumed: " + item + " (Buffer size: " + queue.size() + ")");

        // Notify producer that space is available
        notify();

        return item;
    }
}

// Producer class
class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 1;
        try {
            while (!Thread.currentThread().isInterrupted()) {
                buffer.produce(item++);
                Thread.sleep(1000); // Produce every 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                int item = buffer.consume();
                Thread.sleep(1500); // Consume every 1.5 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}