interface AreaRect
{
float area(float length, float breadth);
}
class Area implements AreaRect
{
public float area(float length, float breadth)
{
return(length*breadth);
}
public static void main(String args[])
{
Area obj=new Area();
System.out.println("Area: " +obj.area(2,5));
}
}
