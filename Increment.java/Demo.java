class Demo 
{
    public static void main(String []args)
    {
        //post increment.
        int a = 5;
        a++;
        System.out.println(a);
        //post decrement.
        a--;
        System.out.println(a);
        //pre decrement.
        --a;
        System.out.println(a);
        //post increment.
        int num1=5;
        int num2= num1++;
        System.out.println(num2);
        //problem related to increment and decrement operators.
        int e=5;
        int f= e++ + ++e + --e;
        System.out.println(f);
    }
}
