import java.util.Scanner;
class StarPattern
{
    public static void main(String []args)
    {
    int n;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        for(int j=0; j<=n; j++)
        {    
        for(int i =0; i<=n; i++)
        {
            System.out.print("*");
        }
            System.out.println();
        }
    }
}