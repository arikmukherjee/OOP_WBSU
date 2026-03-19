//hierarchial inheritance
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
    void ip2(int x,int y){
        a=x;
        b=y;
    }
    void op2(){
        op1();
        System.out.println("b ="+b);
    }
}
class Cl3 extends Cl1
{
    int c;
    void ip3(int x, int z){
        a=x;
        c=z;
    }
    void op3(){
        op1();
        System.out.println("c ="+c);
    }
}
public class P5
{
	public static void main(String[] args) {
	    Cl2 ob1 = new Cl2();
	    ob1.ip2(10,15);
	    ob1.op2();
		Cl3 ob2 = new Cl3();
		ob2.ip3(20,25);
		ob2.op3();
	}
}