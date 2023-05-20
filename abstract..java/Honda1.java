final class Bike
{
    public void run()
    {
        System.out.println("Bike is running");
    }
}
class Honda1 extends Bike
{
    void run()
    {
        System.out.println("running safely with 100 kmph");
    }
    public static void main(String args[])
    {
        Honda1 honda =new Honda1();
        honda.run();
    }
}