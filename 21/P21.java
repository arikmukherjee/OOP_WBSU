//Final Keyword
//final variable

// class P21
// {
//     public static void main(String[] args)
//     {
//         final int a = 10;
//         a = 20; //error because final variable cannot be changed
//         System.out.println("a ="+a); //10
//     }
// }

//------------------------------------------------------------------------
class Cl1
{
    final int a = 10;
    void f1(){
        //a = 20; //error because final variable cannot be changed
        System.out.println("a ="+a); //10
    }
}
class Cl2 extends Cl1
{
    void f2(){
        System.out.println("a ="+a); //10
    }
}
public class P21
{
    public static void main(String[] args)
    {
        Cl2 ob = new Cl2();
        ob.f1();
        ob.f2();
    }
}