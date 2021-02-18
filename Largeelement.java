public class Largeelement {
    public static void main(String args[])
    {
            int array[] = {1, 3, 2, 10, 15, 20, 33, 21, 27, 50, 99, 22, 40};
            int large = array[0];
            int loc = 0;
            for(int i = 0; i < array.length; i++)
            {
                if(array[i] > large)
                {
                    large = array[i];
                    loc = i;
                }
            }
            System.out.println("Largest element " + large + " found at location " + loc);
    }
}
