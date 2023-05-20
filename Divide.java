//wap to demonstrate third use of throw keyword.
class Divide
{
    public static int divide (int x, int y)
    {
        try
        {
            return x/y;
        }
        catch (ArithmeticException e)
        {
            System.out.println ("ArithmeticExceptionCaught in divide, rethrowing");
            throw (e);
        }
    }
    public static void main (String[] args)
    {
        try
        {
            int a = Integer.parseInt (args[0]);
            int b = Integer.parseInt (args[1]);
            int c = divide (a,b);
            System.out.println ("Result is :" +c);
        }
        catch (Exception e)
        {
            System.out.println ("skc");
            System.out.println (e);
        }
        System.out.println ("normal flow");
    }
}