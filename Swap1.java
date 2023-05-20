//wap to demonstrate swap two numbers without using third variables in one line.
class Swap1
{
    public static void main (String arg[])
    {
        int a=10, b=20;
        System.out.println ("Before swapping");
        System.out.println ("a->" +a);
        System.out.println ("b->" +b);
        System.out.println ("After swapping");
        a= (a+b) - (b=a);
        System.out.println ("a->" +a);
        System.out.println ("b->" +b);
    }
}