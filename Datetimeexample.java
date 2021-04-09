import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
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
    /*
      String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
         "Oct", "Nov", "Dec"};
      
      int year;
      GregorianCalendar gcalendar = new GregorianCalendar();
      gcalendar.setGregorianChange(new Date(2001, 9, 11));
      System.out.print("Date: ");
      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
      System.out.println(year = gcalendar.get(Calendar.YEAR));
      System.out.println("Gregorian Change Date" + cal.getGregorianChange());
      //
      GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();

      // print the current date and time
      System.out.println("" + cal.getTime());

      // set gregorian change at another date
      cal.setGregorianChange(new Date(92, 12, 10));
      System.out.println("Gregorian Change Date" + cal.getGregorianChange());
      */
}
