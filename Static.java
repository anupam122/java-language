//wap to demonstrate the static data member and static method.
public class Static
{
static int a;
public static void display()
{
System.out.println ("Hello static");
}
public static void main (String arg[])
{
int c=8;
System.out.println ("Local variable" +c);
System.out.println ("class member" +Static.a);
Static.display();
}
}