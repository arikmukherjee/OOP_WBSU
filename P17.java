//interface shape
// input()
// area()
//Class Circle, Rectangle


interface Shape
{
    
    void ip();
    void area();
}
class Circle implements Shape
{
    int radius;
    public void ip()
    {
        radius = 10;
    }
    public void area()
    {
        float area = 3.14f * radius * radius;
        System.out.println("area of circle ="+area);
    }
}
class Rectangle implements Shape
{
    int length, breadth;
    public void ip()
    {
        length = 10;
        breadth = 20;
    }
    public void area()
    {
        float area = length * breadth;
        System.out.println("area of rectangle ="+area);
    }
}
public class P17
{
    public static void main(String[] args)
    {
        Circle ob1 = new Circle();
        ob1.ip();
        ob1.area();
        Rectangle ob2 = new Rectangle();
        ob2.ip();
        ob2.area();
    }
}

