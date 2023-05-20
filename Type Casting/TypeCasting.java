class TypeCasting
{
    public static void main(String []args)
    {
        //implicit typecasting
       int a=10;
        double b;
        b = a;
        System.out.println(b);

        //explicit typecasting
        double num=30;
        int num1;
        num1 = (int)num;
        System.out.println(num1);

        //truncate
        int num2 = 12;
        int num3 = 5;
        float res;
        res = num2/num3;
        System.out.println(res); 

    }
}