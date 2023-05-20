class String3
{
    public static void main(String []args)
    {
        String a = "aman";
        String b = "aman";
        System.out.println(a==b);   //inside the string constant pool (SCP)

        String c = new String("mohan");
        String d = new String("mohan");
        System.out.println(c==d);

    }
}