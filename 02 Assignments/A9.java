import P1.Stack;
import P1.Imp;

public class A9 {
    public static void main(String[] args) {
        Stack s = new Imp();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();
        s.display();
    }
}