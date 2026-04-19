class P33
{
    public static void main(String[] args)
    {
        String s1 = "Arik";
        String s2 = "Sritam";
        String s3 = s1 + s2;
        System.out.println(s3);
        int a = Integer.parseInt(s1); //NumberFormatException
        int b = Integer.parseInt(s2);
        int c = a + b;
        System.out.println(c); //NumberFormatException
    }
}