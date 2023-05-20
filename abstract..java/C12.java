//wap to demonstrate the abstract class.
abstract class Ab1
{
    public abstract void display();
}
class C12 extends Ab1
{
    public void display()
    {
        System.out.println("Hello cpp");
    }
    public static void main(String arg[])
    {
        C12 x1 = new C12();
        x1.display();
    }
}