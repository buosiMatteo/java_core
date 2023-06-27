import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Task15 {
    public static void main(String[] args) {
        DateFormat date = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ITALIAN);
        Date now = Calendar.getInstance().getTime();
        System.out.println(date.format(now));
    }
}
