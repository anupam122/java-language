class Mutable3
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuilder sc = new StringBuilder();
        System.out.println(sc.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("s");
        System.out.println(sb.capacity()); //how many characters you can add
        System.out.println(sb.length());   //how many characters are present
    }
}