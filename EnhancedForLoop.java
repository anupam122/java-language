class EnhancedForLoop
{
    public static void main(String []args)
    {
        int nums[][] = {
            {4,3},
            {7,7},
            {1,0,9}
        };
        for(int a[] : nums)
        {
            for(int b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}