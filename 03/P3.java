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
    void ip2(int x, int y){
        a=x;
        b=y;
    }
    void op2(){
        op1();
        System.out.println("b ="+b);
    }
}


public class P3
{
	public static void main(String[] args) {
		Cl2 ob = new Cl2();
		ob.ip2(10,15);
	
		ob.op2();
	}
}