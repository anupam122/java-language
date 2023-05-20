class Mutable
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("virat");
        System.out.println(sb);
        //StringBuffer sb =""; invalid
        sb.append("Kohli");
        System.out.println(sb);
    }
}