public class Lab1Q1 {
    public static void square(int size)
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(i == 0 || j == 0 || i == size-1 || j == size-1)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int size)
    {
        int count = 1;
        for (int i = 1; i <= 2 * size - 1; i++) {
            for (int j = count; j <= size; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("* ");
            }
            if (i < size)
                count++;
            else
                count--;
            System.out.println("");
        }
    }
    public static void oval(int size)
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(i == j || (i == 0 && j == size) || (i == size && j == 0))
                {
                    System.out.print("   ");
                }
                else if(i == 0 || j == 0 || i == size-1 || j == size-1)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void arrow()
    {
        int i, k, flag = 1;
     
    // Loop to handle number of rows and
    // columns in this case
    for(i = 1, k = 0; i <= 2 * 3 - 1; i++) 
    {
         
        // Handles case 1
        if (i < 3 - k)
            System.out.print(" ");
 
        // Handles case 2
        else
        {
            if (flag == 1)
                System.out.print("*");
            else
                System.out.print(" ");
 
            flag = 1 - flag;
        }
 
        // Condition to check case 3
        if (i == 3 + k)
        {
            k++;
            System.out.println();
             
            // Since for nth row we have
            // 2 * n- 1 columns
            if (i == 2 * 3 - 1)
                break;
 
            // Reinitializing i as 0,
            // for next row
            i = 0;
            flag = 1;
        }
        for(int l = 0; l < 5; l++)
        {
            System.out.println(" * ");
        }
    }
    }
    public static void main(String[] args)
    {
        //square(7);
        //diamond(5);
        //oval(5);
        //arrow();
    }
}
