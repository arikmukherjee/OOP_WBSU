//OVERRIDING
class Cl1
{
    void f(){
        System.out.println("super class");
    }
}
class Cl2 extends Cl1
{
    void f(){
        System.out.println("sub class");
    }
}
public class P10_2
{
	public static void main(String[] args) {
		Cl2 ob = new Cl2();
		ob.f();
	}
}