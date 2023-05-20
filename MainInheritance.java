class common
{
    int l,b;
    public common (int x, int y)
    {
        l=x;
        b=y;
    }
    public void display()
    {
        System.out.println("Length is "+l);
        System.out.println("Breadth is "+b);
    }
}
class Rect extends common
{
    public Rect (int x, int y)
    {
        super (x,y);
    }
    public int area ()
    {
        return l*b;
    }
}
class Cuboid extends common
{
    int h;
    public Cuboid (int x, int y, int g)
    {
        super (x,y);
        h=g;
    }
    public void display ()
    {
        super.display ();
        System.out.println ("Height is" +h);
    }
    public int volume ()
    {
        return l*b*h;
    }
}
class MainInheritance 
{
    public static void main (String args[])
    {
        Rect r1 = new Rect (4,5);
        r1.display ();
        System.out.println ("Area is" +r1.area());
        Cuboid c1 = new Cuboid (4,5,6);
        c1.display ();
        System.out.println ("Volume is" +c1.volume());
    }
}