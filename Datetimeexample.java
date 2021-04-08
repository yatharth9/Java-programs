import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;
public class Datetimeexample {
    
    public static void main(String[] args)
    {
        LocalDateTime ld1 = LocalDateTime.now();
        System.out.print(ld1);

        Set<String> allzoneids = ZoneId.getAvailableZoneIds();
        System.out.println(allzoneids);

        Date date = new Date();
        Long presentdate = date.getTime();

        System.out.println(presentdate);

        String str = String.format("Current Date/Time : %tc", date );
        System.out.println(str);
        
        try { 
            System.out.println(new Date( ) + "\n"); 
            Thread.sleep(5*60*10); 
            System.out.println(new Date( ) + "\n"); 
         } catch (Exception e) {
            System.out.println("Got an exception!"); 
         }
      }
}
