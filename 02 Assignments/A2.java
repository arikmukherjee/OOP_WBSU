class Shape {
    void display() {
        System.out.println("Calculating Area...");
    }
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    void input1(double r) {
        radius = r;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    void input2(double l, double w) {
        length = l;
        width = w;
    }
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    void input3(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class A2 {
    public static void main(String[] args) {

        Shape s;
        Circle c = new Circle();
        c.input1(5);
        s = c;
        s.display();
        System.out.println("Circle Area: " + s.area());

        Rectangle r = new Rectangle();
        r.input2(4, 6);
        s = r;
        System.out.println("Rectangle Area: " + s.area());

        Triangle t = new Triangle();
        t.input3(3, 8);
        s = t;
        System.out.println("Triangle Area: " + s.area());
    }
}