import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class stream1 
{
    public static void main(String[] args)
    {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);

        stream.forEach(p -> System.out.println(p*3));

        List<Integer> l1 = new ArrayList();
        
        for(int i = 0; i<10; i++)
        {
            l1.add(i);
        }
        Stream <Integer> stream3 = l1.stream();
        stream3.forEach(p-> System.out.println(p*2));
        System.out.println(l1);
    }
}
