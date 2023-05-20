//wap to demonstrate the class member in Java.
class MemberDetail
{
    static int a=4;
    public static void main (String arg[])
    {
        int c=0;
        System.out.println ("local variable" +c);
        System.out.println ("class member" +MemberDetail.a);
    }
}