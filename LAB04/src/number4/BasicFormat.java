/* 2013112015 ¿”¡¯º∑ */

package number4;
import java.text.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class BasicFormat {
   /** Specifies basic formatting for dates, integers, money, and people */
   public static String formatDate(Date date) {
	  date.setMonth(date.getMonth()-1);
      return new SimpleDateFormat("d MMM yyyy").format(date);
   }

   /**
    * Formats a date
    * 
    * @param year  Full integral value of the year, e.g. 1945, 2008
    * @param month Zero-based month index, e.g. 0 is January, 6 is July
    * @param day   One-based day of the month
    */
   
   public static String formatDate(int year, int month, int day) {
      return new SimpleDateFormat("d MMM yyyy").format(new GregorianCalendar(year, month-1, day).getTime());
   }

   public static String formatLong(long number) {
	   return new DecimalFormat("#,###").format(number);
   }

   public static String formatLong(double number) {
	  return new DecimalFormat("#,###").format(number);
   }

   public static String formatMoney(double amount) {
      return new DecimalFormat("$ #,##0.##").format(amount);
   }

   public static String formatPerson(String firstName, String lastName, String userName) {
	   return new MessageFormat("{0}, {1} [{2}]").format(new Object[]{firstName,lastName,userName});  
   }

}