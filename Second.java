import java.io.*;

class Second{
public static void main(String[] args) throws IOException
   {
        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader bufread = new BufferedReader(istream);
        System.out.println("Welcome to second Java Program");
        System.out.println("Enter your Name");
        String firstname = bufread.readLine();

        try{
            System.out.println("Please enter the year you were born ");
            String bornYear = bufread.readLine();
            int byear = Integer.parseInt(bornYear);
            System.out.println("Hello " + firstname + " Your Birthyear: " + byear);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error! Non number entered for expected number. Try again");
        }
    }
}