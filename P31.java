class P31
{
    public static void main(String[] args)
    {
        String s = "Hello";
        System.out.println(s.charAt(0));
        try{
            System.out.println(s.charAt(5)); //StringIndexOutOfBoundsException
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Error in StringIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Error in Exception");
        }
        System.out.println("Program ends");
    }
}