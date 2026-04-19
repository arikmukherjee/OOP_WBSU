//interface Cl1
//interface Cl2 extends Cl1
//interface Cl3 extends Cl1
//class Cl4 implements Cl2
//class Cl5 implements Cl3

interface Cl1
{
    void f1();
}
interface Cl2 extends Cl1
{
    void f2();
}
interface Cl3 extends Cl1
{
    public void f3();
}
class Cl4 implements Cl2
{
    public void f1()
    {
        System.out.println("f1");
    }
    public void f2()
    {
        System.out.println("f2");
    }
}
class Cl5 implements Cl3
{
    public void f1()
    {
        System.out.println("f1");
    }
    public void f3()
    {
        System.out.println("f3");
    }
}
public class P20
{
    public static void main(String[] args)
    {
        Cl4 ob1 = new Cl4();
        ob1.f1();
        ob1.f2();
        Cl5 ob2 = new Cl5();
        ob2.f1();
        ob2.f3();
    }
}