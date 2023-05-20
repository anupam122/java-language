//wap to demonstrate the solution in abstract method.
abstract class Ab1
{
    public void display()
    {
        System.out.println("Hello abstract");
    }
    public abstract void print();
}
class AbsDemo extends Ab1
{
    public void print()
    {
        System.out.println("Hello abstract method");
    }
    public static void main(String arg[])
    {
        AbsDemo x1 = new AbsDemo();
        x1.display();
        x1.print();
    }
}