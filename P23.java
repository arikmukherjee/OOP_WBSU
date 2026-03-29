//final class

final class Cl1
{
    void f1(){
        System.out.println("f1");
    }
}
class Cl2 extends Cl1
{
    void f2(){
        System.out.println("f2");
    }
}
public class P23
{
    public static void main(String[] args)
    {
        Cl2 ob = new Cl2();
        ob.f1();
        ob.f2();
    }
}