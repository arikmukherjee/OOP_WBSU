class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("T1: " + i);
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("T2: " + i);
        }
    }
}

public class A14 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}