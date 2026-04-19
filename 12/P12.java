class Cl1
{
    int a = 10;
    void ip1(int x){
       a = x; 
    }
    void op1(){
        System.out.println("a ="+a);
    }
}
class Cl2 extends Cl1
{
    int a = 20;
    void ip2(int x){
       a = x; 
       super.a = 100;
    }
    void op2(){
        System.out.println("a ="+a); //30
        System.out.println("super.a ="+ super.a);//100
    }
}

public class P12
{
	public static void main(String[] args) {
	    Cl2 ob2 = new Cl2();
	    ob2.ip2(30);
		ob2.op2();
	}
}