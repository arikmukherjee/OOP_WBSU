// throw keyword
class P28
{
    public static void main(String[] args)
    {
        
        System.out.println("Program starts");
        try{
            throw new Exception("Error");
        }
        catch(Exception e){
            System.out.println("Error in Exception");
        }
        System.out.println("Program ends");

    }
}