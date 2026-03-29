//final method

class Cl1
{
    final void f1(){
        System.out.println("f1");
    }
    void f2(){
        System.out.println("f2");
    }
}
class Cl2 extends Cl1
{
    void f2(){
        System.out.println("f2 changed");
    }
}
public class P22
{
    public static void main(String[] args)
    {
        Cl2 ob = new Cl2();
        ob.f1();
        ob.f2();
    }
}