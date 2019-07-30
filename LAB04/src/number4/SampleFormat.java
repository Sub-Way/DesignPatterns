/* 2013112015 임진섭 */

package number4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.MessageFormat;

public class SampleFormat {
   public static void main(String[] args) {
	   SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
	    /* A pretty integer format. Examples:
	       4,235,682
	       5,487 
	       42
	    */
      DecimalFormat intFormat = new DecimalFormat("#,###");
      /*
       * A monetary format. Examples: $ 4,235,670 $ 345.23 $ 0.48
       */
      DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.##");
      /*
       * A person format using first, last, and user names. Examples: Weinman, Jerod
       * [weinman] Davis, Janet [davisjan] Coahran, Marge [coahranm] The {x} syntax
       * means replace with the x'th index of an array.
       */
      MessageFormat personFormat = new MessageFormat("{0}, {1} [{2}]");

      /* BasicFormat 테스트 */
      System.out.println("BasicFormat 테스트");
      System.out.println("Date: " + BasicFormat.formatDate(new GregorianCalendar(2005, 7, 4).getTime()));
      System.out.println("Date: " + BasicFormat.formatDate(2005, 7, 4));
      System.out.println("Long: " + BasicFormat.formatLong(1234567));
      System.out.println("Long: " + BasicFormat.formatLong(68));
      System.out.println("Moeny : " + BasicFormat.formatMoney(9812345));
      System.out.println("Money: " + BasicFormat.formatMoney(.78));
      System.out.println("Person : " + BasicFormat.formatPerson("Weinman", "Jerod", "weinman"));
      
      // dateFormat.format() expects a Date object. Use
      // GregorianCalendar to construct a Calendar object and the
      // getTime() method to convert it to a Date.
      System.out.println("SampleFormat 테스트");
      System.out.println("Integer: " + intFormat.format(1234567));
      System.out.println("Integer: " + intFormat.format(68));
      System.out.println("Money: " + dollarFormat.format(9812345.678));
      System.out.println("Money: " + dollarFormat.format(9812345));
      System.out.println("Money: " + dollarFormat.format(.78));
      System.out.println("Person: " + personFormat.format(new Object[] { "Weinman", "Jerod", "weinman" }));
      // We can create and initialize an Object array on the fly, as
      // shown above.
   }

}