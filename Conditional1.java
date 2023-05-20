class Conditional1
{
    public static void main(String []args)
    {
        int age=62;
        if(age>=18 && age<60)
        {
            System.out.println("You are an adult");
        }
        else if(age>60)
        {
            System.out.println("You are an old");
        }
        else
        {
            System.out.println("you are a kid");
        }
    }
}