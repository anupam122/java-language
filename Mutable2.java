class Mutable2
{
    public static void main(String[] args)
    {
        /*final int a = 10;
        a=20;
        System.out.println(a); */
        final StringBuffer sb = new StringBuffer("virat");
        sb.append("kohli");
        System.out.println(sb);
        /*sb = new StringBuffer("Sachin");
        System.out.println(sb);*/
    }
}