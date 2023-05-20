class StarPattern3
{
    public static void main(String []args)
    {
        int n=7;
        for(int i=0;i<7;i++)
        {
        for(int j=0;j<7;j++)
        {
            if(j==0 || j==n-1 || i==(n-1)/2)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}