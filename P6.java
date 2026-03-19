class Cl1
{
    int a;
    Cl1(){
        a=10;
        System.out.println("Calling super class constructor");
    }
    void op1(){
        System.out.println("a ="+a);
    }
}
class Cl2 extends Cl1
{
    int b;
    Cl2(){
        b=15;
        System.out.println("Calling sub class constructor");
    }
    void op2(){
        op1();
        System.out.println("b ="+b);
    }
}
public class P6
{
	public static void main(String[] args) {
		Cl2 ob = new Cl2();
		ob.op2();
	}
}