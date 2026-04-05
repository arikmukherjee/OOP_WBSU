// Custom Exception
class Cl extends Exception
{
    Cl(String s){
        super(s);
    }
}
class P34
{
    public static void main(String[] args)
    {
        try{
            throw new Cl("Error"); //Custom Exception
        }
        catch(Cl e){
            System.out.println(e); //Custom Exception
        }
        catch(Exception e){
            System.out.println(e); //Exception
        }
        System.out.println("Program ends");
    }
}