class SharedBuffer {
    int data;
    boolean available = false;

    // Producer method
    synchronized void produce(int value) {
        try {
            while (available) {
                wait();
            }

            data = value;
            System.out.println("Produced: " + data);

            available = true;
            notify();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Consumer method
    synchronized void consume() {
        try {
            while (!available) {
                wait();
            }

            System.out.println("Consumed: " + data);

            available = false;
            notify();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Producer Thread
class Producer extends Thread {
    SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
        }
    }
}

// Main Class
public class A15 {
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}