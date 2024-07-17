import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) throws ParseException {
//        Scanner scanner = new Scanner(System.in);
//        String fullName = scanner.nextLine();
//        System.out.println(fullName);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        Date date = calendar.getTime();
        System.out.println(date.getMonth());
//        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
//        Date simpleDate = sd.parse(calendar.getTime().toString());

    }
}