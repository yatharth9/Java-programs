import java.io.*;
import java.util.*;

public class timespan 
{
    int globalhour, globalminute;
    
    void appendminutes()
    {
        if(globalminute > 60)
        {
            int remminutes = globalminute % 60;
            int remhour = globalminute - remminutes;
            int additionalhour = remhour / 60;
            globalhour += additionalhour;
            globalminute = remminutes;
        }
    }

    public timespan(int hours, int minutes)
    {
        globalhour = 0;
        globalminute = 0;
        if (minutes > 59)
        {
            throw new SecurityException("Minutes greater than 59");
        }
        globalhour += hours;
        globalminute += minutes;
    }
    
    int getHours()
    {
        return globalhour;
    }

    public int getMinutes()
    {
        return globalminute;
    }

    public void add(int hours, int minutes)
    {
        globalhour += hours;
        globalminute += minutes;
        appendminutes();
    }

    public void add(timespan t)
    {
        add(t.globalhour, t.globalminute);
    }

    public double getTotalHours()
    {
        double robject = (globalhour + (globalminute / 60.0));
        return robject;
    }

    public String toString()
    {
        String restring = globalhour + "h" + globalminute + "m";
        return restring;
    }

}

public class assignment4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hour");
        int h1 = sc.nextInt();
        System.out.println("Enter the minute");
        int m1 = sc.nextInt();
        timespan ts1 = new timespan(h1, m1);
        String ts1s = ts1.toString();
        System.out.println(ts1s);
        System.out.println("Enter the Hour");
        int h2 = sc.nextInt();
        System.out.println("Enter the minute");
        int m2 = sc.nextInt();
        timespan ts2 = new timespan(h2, m2);
        ts1.add(ts2);
        ts1.toString();
        String ts1s2 = ts1.toString();
        System.out.println(ts1s2);
    }
}