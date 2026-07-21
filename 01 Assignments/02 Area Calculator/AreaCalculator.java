// Base Class
class Shape {
    // Method 1
    void calculateArea() {
        System.out.println("Area not defined");
    }

    // Method 2
    void display() {
        System.out.println("This is a shape");
    }
}

// Derived Class: Circle
class Circle extends Shape {
    double radius;

    // Method 1
    void setRadius(double r) {
        radius = r;
    }

    // Method 2 (Overriding)
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Derived Class: Rectangle
class Rectangle extends Shape {
    double length, width;

    // Method 1
    void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    // Method 2 (Overriding)
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Derived Class: Triangle
class Triangle extends Shape {
    double base, height;

    // Method 1
    void setDimensions(double b, double h) {
        base = b;
        height = h;
    }

    // Method 2 (Overriding)
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Main Class
public class AreaCalculator {
    public static void main(String[] args) {

        Shape s;

        // Circle
        Circle c = new Circle();
        c.setRadius(5);
        s = c;
        s.calculateArea();

        // Rectangle
        Rectangle r = new Rectangle();
        r.setDimensions(4, 6);
        s = r;
        s.calculateArea();

        // Triangle
        Triangle t = new Triangle();
        t.setDimensions(3, 7);
        s = t;
        s.calculateArea();
    }
}