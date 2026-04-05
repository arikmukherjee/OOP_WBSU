class P30
{
    public static void main(String[] args)
    {
        
        String s[] = new String[3];
        s[0] = "Hello";
        s[1] = "World";
        s[2] = "Java";
        System.out.println("s[0] ="+s[0]);
        System.out.println("s[1] ="+s[1]);
        System.out.println("s[2] ="+s[2]);
        try{
            s[3] = "Python";
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error in ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Error in Exception");
        }
        System.out.println("Program ends");
        
    }
}