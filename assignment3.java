import java.util.*;
import java.util.stream.*;

public class assignment3 {
    public static void main(String[] args)
    {
        List<Integer> r = new ArrayList<Integer>();
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);
        r.add(6);
        double pi = 3.14, area;
        Stream s = r.stream();
        s.forEach(x-> System.out.println((int)x*((int)x*pi)));
    }
}
