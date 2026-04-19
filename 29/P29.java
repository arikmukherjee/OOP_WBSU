class P29
{
    public static void main(String[] args)
    {
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        System.out.println("a[0] ="+a[0]);
        System.out.println("a[1] ="+a[1]);
        System.out.println("a[2] ="+a[2]);
        try{
            a[3] = 40;
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