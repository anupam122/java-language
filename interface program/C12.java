//wap to demonstrate Multiple Inheritance in java using interface.
interface I1
{
    public void display1();
}
interface I2
{
    public void display2();
}
class C12 implements I1,I2
{
    public void display1()
    {
        System.out.println("hello java");
}
public void display2()
{
    System.out.println ("hello cpp");
}
public static void main (String arg[])
{
    C12 x1 = new C12();
    x1.display1();
    x1.display2();
}
}