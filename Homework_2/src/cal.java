
import java.util.Calendar;

/**
 * @author 吴家明
 * 15130110076
 */

public class cal {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        try {
            int month, year;
            month = Integer.parseInt(args[0]);
            c.set(Calendar.MONTH,month-1);
            year = Integer.parseInt(args[1]);
            c.set(Calendar.YEAR,year);

            if (month <= 0 || month > 12)   c = Calendar.getInstance(); //wrong month arg

            c.set(Calendar.DATE,1);
        }   catch (Exception e) {
        }
        solution(c);
    }

    private static int getDayOfWeek(Calendar c) {
        return c.get(Calendar.DAY_OF_WEEK);
    }
    private static int daysInMonth( Calendar c) {
        return(c.getActualMaximum(Calendar.DAY_OF_MONTH));
    }

    private static final String[] MONTHS = { "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"};

    private static void solution(Calendar c) {
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        System.out.print(MONTHS[month] + " ");
        System.out.println(year);

        int daysinmonth = daysInMonth(c);
        int dayofweek = getDayOfWeek(c);
        System.out.println("Su "+"Mo "+"Tu "+"We "+"Th "+"Fr "+"Sa");
        for (int i = 1; i < dayofweek; i++) {
            System.out.print("   ");
        }
        int weekloop = dayofweek - 1;
        for (int i = 1; i <= daysinmonth; i++) {
            if (weekloop == 7) {
                System.out.println("");
                weekloop = 0;
            }
            System.out.printf("%2d"+" ", i);
            weekloop++;
        }
    }
}
