public class Area
{
    int Area(int s);
    {
        return s*s;
    }
    int Area(int l,int b);
    {
        return l*b;
    }
}
class Area2
{
    Area obj=new Area();
    System.out.println("Area of the Square is:"+obj.Area(4));
    System.out.println("Area of the Ractangle is:"+obj.Area(3,4));
}