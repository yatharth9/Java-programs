public class varargs {
    public void sum(double ... args)
    {
        int sum = 0;
        for( double i : args)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
