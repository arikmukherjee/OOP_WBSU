//abstract class

//minimum one abstract method is required in abstract class

abstract class Cl1{
    abstract void f1();
    void f2(){
        System.out.println("f2");
    }
}
class Cl2 extends Cl1{
    void f1(){
        System.out.println("f1");
    }
}
public class P24
{
    public static void main(String[] args)
    {
        Cl2 ob = new Cl2();
        ob.f1();
        ob.f2();
    }
}