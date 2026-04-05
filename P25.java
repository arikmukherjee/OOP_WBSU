// Divide by zero exception

class P25
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0;
        try{
        int c = a / b;
        System.out.println("c ="+c);
        }
        catch(Exception e){
            System.out.println("Error");
        }
        System.out.println("Program ended successfully");
    }
}