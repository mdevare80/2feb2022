class Shape
{
    void area(int length, int breadth)
        {
            System.out.println("Area of Rectangle: "+length*breadth);
        }
    void area(double radius)
    {
        System.out.println("Area of Circle: "+3.14*radius*radius);
    }
    void area(float base, float height)
    {
       System.out.println("Area of Triangle: "+0.5*base*height);
    }
}
class Calculation
{
    public static void main(String args[])
    {
       Shape od=new Shape();
       od.area(8,5);
       od.area(4.9);
       od.area(9,7);
    }
}