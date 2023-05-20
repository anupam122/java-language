import java.util.Scanner;
public class Dynamic
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the age");
        int age = scan.nextInt();
        System.out.println("Age is" + age);

        System.out.println("enter the average");
        double average = scan.nextDouble();
        System.out.println("average is" +average);

        System.out.println("enter the name");
        String name = scan.next();
        System.out.println("the name is" +name);
    }
}