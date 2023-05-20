interface I1
{
    public void display();
}
class C11 implements I1
{
    public void display()
    {
        System.out.println ("hello java");
    }
    public static void main (String args[])
    {
        C11 x1 = new C11();
        x1.display();
    }
}