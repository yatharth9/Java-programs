import java.util.*;
public class Treeset1 {
    public static void main(String[] args)
    {
        TreeSet<Integer> t1 = new TreeSet<Integer>();
        t1.add(3);
        t1.add(15);
        t1.add(21);
        t1.add(31);

        //Traversing elements
        Iterator<Integer> itr=t1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
