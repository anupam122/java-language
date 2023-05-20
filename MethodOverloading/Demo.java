class Calc
{
public int add(int a , int b)
  {
    int result = a + b;
    return result;
  }
public int add(int a, int b, int c)
  {
    int result1 = a + b + c;
    return result1;
  }
public double add(double a, double b)
  {
    double result2 = a + b;
    return result2;
}
}
public class Demo
{
  public static void main(String []args)
   {
     Calc obj = new Calc();
     int res1 = obj.add(5,10);
     int res2 = obj.add(5,10,15);
     double res3 = obj.add(2.5,3.1);
     System.out.println(res1);
     System.out.println(res2);
     System.out.println(res3);
    }
}
    
