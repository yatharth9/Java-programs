import java.util.Scanner;
public class Lab1Q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers between 1 and 30");
        int[] nums = new int[5];
        int loc = 0;
        abc:
        while(loc < 5)
        {
            int temp = sc.nextInt();
            if(temp > 30 || temp < 1)
            {
                System.out.println("Error. Enter number between 1 and 30");
                continue abc;
            }
            nums[loc] = temp;
            loc++;
        }
        sc.close();
        int location = 0;
        System.out.println("\n\n");
        while(location < nums.length)
        {
            int len = nums[location];
            System.out.print(len);
            System.out.print("\t");
            for(int i = 0; i < len; i++)
            {
                System.out.print("*");
            }
            System.out.println();
            location++;
        }
    }
}
