class Cl1 {
    void f() {
        System.out.println("super class");
    }
}

class Cl2 extends Cl1 {
    void f() {
        System.out.println("sub class");
    }
}

public class P13 {
    public static void main(String[] args) {
        Cl2 ob = new Cl1(); // error // Dynamic Dispatch
        ob.f();
    }
}