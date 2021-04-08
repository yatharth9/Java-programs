import java.io.*;

public class exception1 {
    public static void main(String[] args)
    {
        FileInputStream fis = null;

        fis = new FileInputStream("E:/College/1 Sem/Cse Programming/Assignment 2.txt");
        int k;


        while((k = fis.read()) != -1)
        {
            System.out.print((char)k);
        }
        fis.close();
    }
}
