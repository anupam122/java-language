//wap to demonstrate the simple inheritance.
class P1
{
    int a=5,b=2;
    public void add()
    {
        System.out.println ("Addition is"+(a+b));
    }
}
class C1
{
    public void sub()
    {
        System.out.println ("Subtraction is"+(a-b));
    }
}
class SI1
{
    public static void main(String arg[])
    {
        C1 x1 = new C1();
        x1.add();
        x1.sub();
    }
}
