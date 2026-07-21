public class ThreadPriority {
    public static void main(String[] args) {
        // Create threads with different priorities
        Thread lowPriority = new Thread(new PriorityRunnable("Low Priority Thread"));
        Thread normalPriority = new Thread(new PriorityRunnable("Normal Priority Thread"));
        Thread highPriority = new Thread(new PriorityRunnable("High Priority Thread"));

        // Set thread priorities
        lowPriority.setPriority(Thread.MIN_PRIORITY);     // Priority 1
        normalPriority.setPriority(Thread.NORM_PRIORITY); // Priority 5
        highPriority.setPriority(Thread.MAX_PRIORITY);    // Priority 10

        // Display priorities before starting
        System.out.println("Thread Priorities:");
        System.out.println(lowPriority.getName() + " - Priority: " + lowPriority.getPriority());
        System.out.println(normalPriority.getName() + " - Priority: " + normalPriority.getPriority());
        System.out.println(highPriority.getName() + " - Priority: " + highPriority.getPriority());
        System.out.println();

        // Start threads
        lowPriority.start();
        normalPriority.start();
        highPriority.start();

        // Wait for threads to finish
        try {
            lowPriority.join();
            normalPriority.join();
            highPriority.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("\nAll threads have finished execution.");
    }
}

class PriorityRunnable implements Runnable {
    private String threadName;

    public PriorityRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + " - Iteration: " + i + " (Priority: " + Thread.currentThread().getPriority() + ")");
            try {
                // Small sleep to allow other threads to run
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted: " + e.getMessage());
            }
        }
        System.out.println(threadName + " finished.");
    }
}