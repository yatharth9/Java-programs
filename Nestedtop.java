abstract class ShapeX
{
    public abstract void area();
    private int x=5;

    public class Circle1 extends ShapeX
    {
        double r;
        Circle1(double r)
        {
            this.r = r;
        }

        public void area()
        {
            System.out.println("Circle area = "+(3.141*r*r));
        }
    }                                                                      //Circle1 ends here
    
    public static class Rectangle extends ShapeX
    {
        int length;
        int breadth;
        Rectangle(int length, int breadth)
        {
            this.breadth = breadth;
            this.length = length;
        }
        public void area()                                                  //Overridden method
        {
            System.out.println("Rectangle area = "+length*breadth)
        }
    }
}                                                                           //Top level classs ends here

//Driver Class
public class NestedTop
{
    public static void main(String[] args)
    {
        System.out.print("Executes\n");
    }
}