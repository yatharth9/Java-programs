import java.util.Scanner;

public class book {
    Scanner sc = new Scanner(System.in);
    boolean issued;
    String name;
    public book()
    {
        System.out.println("Object initialized with zero arguements. Enter the name and if book issued");
        String title = sc.nextLine();
        boolean out = sc.nextBoolean();
        issued = out;
        name = title;
    }
    public book(String title, boolean out)
    {
        System.out.println("Object initialized with arguements.");
        issued = out;
        name = title;
    }
}

class books extends book
{
    int year;
    public books(String title, boolean out, int time)
    {
        System.out.println("Object initialized with arguements.");
        issued = out;
        name = title;
        year = time;
    }
}