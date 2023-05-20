class Mutable5
{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder(150);
        System.out.println(sb.capacity());
        sb.append("java");
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}