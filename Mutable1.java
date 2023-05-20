class Mutable1
{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Mukesh");
        System.out.println(sb);
        //StringBuffer sb = ""; invalid
        sb.append("Ambani");
        System.out.println(sb);
        
    }
}