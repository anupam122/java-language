//wap to demonstrate the multilevel inheritance.
class Animal
{
    public void eat()
    {
        System.out.println ("eating");
    }
}
class Dog extends Animal
{
    public void bark()
    {
        System.out.println ("barking");
    }
}
class BabyDog extends Dog
{
    public void cry()
    {
        System.out.println ("crying");
    }
}
class ML
{
    public static void main (String arg[])
    {
        BabyDog x1 = new BabyDog();
        x1.eat();
        x1.bark();
        x1.cry();
    }
}

