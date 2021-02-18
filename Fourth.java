import java.io.*;
import java.util.*;

class Fourth
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        System.out.println("Enter the Exponent: ");
        int ex = sc.nextInt();
        int ans = 1;
        for(int i = 0; i < ex; i++)
        {
            ans *= x;
        }
        System.out.println(x + " raised to " + ex + " = " + ans);
        sc.close();
    }
}