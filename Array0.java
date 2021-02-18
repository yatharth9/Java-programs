public class Array0 {
    public static void main(String args[])
    {
        Integer arr[] = new Integer[10];
        for( int i = 0; i < arr.length; i++)
        {
            arr[i] = i*i;
        }
        for( int j = 0; j < arr.length; j++)
        {
            System.out.println(arr[j]);
        }
    }
}
