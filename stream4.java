import java.util.ArrayList;
import java.util.List;

public class stream4 {
    public static void main(String[] args)
    {
        List<String> students = new ArrayList();
        students.add("Manan");
        students.add("Anubhav");
        students.add("Akash");
        students.add("Anirudh");
        students.add("Juhi");

        students.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
    }
}
