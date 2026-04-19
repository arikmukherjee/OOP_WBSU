//single inheritance
class Cl1
{
    int a;
    void ip1(int x){
        a=x;
    }
    void op1(){
        System.out.println("a ="+a);
    }
}
class Cl2 extends Cl1
{
    int b;
    void ip2(int x){
        b=x;
    }
    void op2(){
        System.out.println("b ="+b);
    }
}
public class P1
{
	public static void main(String[] args) {
		Cl2 ob = new Cl2();
		ob.ip1(5);
		ob.ip2(10);
		ob.op1();
		ob.op2();
	}
}