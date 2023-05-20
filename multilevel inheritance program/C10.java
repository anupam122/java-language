interface I1
{
    public void display1();
}
interface I2
{
    public void display2();
}
class C10 implements I1,I2
{
    public void display1()
    {
        System.out.println("hello java");
    }
    public void display2()
    {
        System.out.println("hello cpp");
    }
    public static void main (String args[])
    {
        C10 x1 = new C10();
        x1.display1();
        x1.display2();
    }
}