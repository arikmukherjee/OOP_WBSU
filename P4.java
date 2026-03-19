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
class Cl3 extends Cl2
{
    int c;
    void ip3(int x, int y, int z){
        a=x;
        b=y;
        c=z;
    }
    void op3(){
        op2();
        System.out.println("c ="+c);
    }
}
public class P4
{
	public static void main(String[] args) {
		Cl3 ob = new Cl3();
		ob.ip3(10,15,20);
	
		ob.op3();
	}
}