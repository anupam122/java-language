//wap to demonstrate the object creation and their uses.
public class Static1
{
    static int b;
    int c;
    public static void display()
    {
        System.out.println ("Hello static");
    }
   public void print()
   {
    System.out.println ("India");
   }
   public static void main (String arg[])
   {
    int a=8;
    System.out.println ("Local variable" +a);
    System.out.println ("class member" +Static1.b);
    Static1.display();
    Static1 x1 = new Static1();
    System.out.println ("Instance member" +x1.c);
    x1.print();
   }
}
