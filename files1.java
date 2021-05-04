import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

class files1
{
    public static void main(String[] args) throws IOException
    {
        Stream<String> stream;
        try
        {
            File f1 = new File("E:\\College\\4 Sem\\Java\\Programs\\abc.txt");
            f1.createNewFile();
            String str = "Writing string to file";
            FileWriter fw = new FileWriter(f1);
            fw.write(str);
            fw.close();

            Path pf = Paths.get("E:\\College\\4 Sem\\Java\\Programs");
            List<String> l1 = Files.readAllLines(pf);
            System.out.println(l1);
            stream = Files.lines(pf);

            stream.forEach(System.out::println);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}