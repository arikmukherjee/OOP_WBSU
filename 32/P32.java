class P32
{
    public static void main(String[] args)
    {
        String s = "Hello";
        System.out.println(s.length());
        String s1 = "";
        System.out.println(s1.length());
        try{
            String s2 = null; //no memory allocated to s2
            System.out.println(s2.length());
        }
        catch(NullPointerException e){
            System.out.println("Error in NullPointerException");
        }
        catch(Exception e){
            System.out.println("Error in Exception");
        }
        System.out.println("Program ends");
    }
}