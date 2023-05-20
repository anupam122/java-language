//wap to swap two numbers whithout third variables.
class Swap
{
    public static void main (String arg[])
    {
        int a=5,b=6;
        System.out.println ("Before swapping");
        System.out.println ("a->" +a);
        System.out.println ("b->" +b);
        System.out.println ("After swapping");
a=a+b;
b=a-b;
a=a-b;
System.out.println ("a->" +a);
System.out.println ("b->" +b);   
}
}