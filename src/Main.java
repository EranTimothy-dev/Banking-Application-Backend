import java.text.ParseException;
import java.util.*;
import static java.util.Map.entry;

public class Main {
    Map<Integer,String> MONTHS = Map.ofEntries(
            entry(1,"JANUARY"),
            entry(2,"FEBRUARY"),
            entry(3, "MARCH"),
            entry(4, "APRIL"),
            entry(5, "MAY"),
            entry(6, "JUNE"),
            entry(7, "JULY"),
            entry(8, "AUGUST"),
            entry(9, "SEPTEMBER"),
            entry(10, "OCTOBER"),
            entry(11, "NOVEMBER"),
            entry(12, "DECEMBER")
    );




    public static void main(String[] args) throws ParseException {
//        Scanner scanner = new Scanner(System.in);
//        String fullName = scanner.nextLine();
//        System.out.println(fullName);
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2023);
//        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
//        calendar.set(Calendar.DAY_OF_MONTH, 5);
//        Date date = calendar.getTime();
//        System.out.println(date);
        final Calendar cal = Calendar.getInstance();
//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH);
//        int day = cal.get(Calendar.DAY_OF_MONTH);
        Date date = Calendar.getInstance().getTime();
//        System.out.println(date);
        AccountHolder Eran = new AccountHolder("Eran Timothy Perera", date,"200311500596");
        System.out.println(Eran.name + " " + Eran.nic);






//        System.out.printf("%s/%s/%s, %s:%s:%s",year,month,day,hour,minute,second);
    }
}