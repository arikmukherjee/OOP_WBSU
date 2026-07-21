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

public class A13 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t2.start();
    }
}