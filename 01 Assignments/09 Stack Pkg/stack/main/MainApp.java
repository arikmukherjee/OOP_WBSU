package stack.main;

import stack.implementation.StackImpl;

public class MainApp {

    public static void main(String[] args) {

        StackImpl s = new StackImpl(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped element: " + s.pop());

        s.display();
    }
}