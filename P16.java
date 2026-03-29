interface Cl1
{
    public int a=0;
    void ip();
    void op();
}
class Cl2 implements Cl1
{
    int a = 0;
    public void ip()
    {
        a = 10;
    }
    public void op()
    {
        System.out.println("a ="+a);
    }
}
public class P16
{
    public static void main(String[] args)
    {
        Cl2 ob = new Cl2();
        ob.ip();
        ob.op();
    }
}