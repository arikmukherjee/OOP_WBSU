class Cl1
{
    int a;
    Cl1(int x){
        a=x;
    }
    void op1(){
        System.out.println("a ="+a);
    }
}
class Cl2 extends Cl1
{
    int b;
    Cl2(int x, int y){
        super(x);
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
    Cl3(int x, int y, int z){
        super(x,y);
        c=z;
    }
    void op3(){
        op2();
        System.out.println("c ="+c);
    }
}
public class P8
{
	public static void main(String[] args) {
		Cl3 ob = new Cl3(20,30,40);
		ob.op3();
	}
}