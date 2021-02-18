class Box
{
    double l, b, h;

    public double volume(double l, double b, double h)
    {
        double vol = l * b * h;
        return vol;
    }
}

//Driver class
class Rectangle
{
    public static void main(String[] args)
    {
        Box b1 = new Box();

        double ans = b1.volume(5, 6, 7);
        System.out.println("The volume of Box is " + ans);
    }
}