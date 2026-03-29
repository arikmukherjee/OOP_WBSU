interface Cl1
{
    void f1();
}
interface Cl2 extends Cl1
{
    void f2();
}
class Cl3 implements Cl2
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
public class P19
{
    public static void main(String[] args)
    {
        Cl3 ob = new Cl3();
        ob.f1();
        ob.f2();
    }
}