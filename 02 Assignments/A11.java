class Cl extends Exception
{
    Cl(String a){
        super(a);
    }
}
class A11
{
    public static void main(String[] args)
    {
        try{
            throw new Cl("Error"); 
        }
        catch(Cl e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e); 
        }
        System.out.println("End of program");
    }
}