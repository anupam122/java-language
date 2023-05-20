class Mutable4
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Sachin");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(1));
        sb.setCharAt(1, 'A');
        System.out.println(sb);
    }
}