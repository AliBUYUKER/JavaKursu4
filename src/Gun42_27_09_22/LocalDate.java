package Gun42_27_09_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDate {
    public static void main(String[] args) {

        LocalDateTime tn=LocalDateTime.now();
        System.out.println(tn.getYear()+"-"+tn.getMonth()+"-"+tn.getDayOfMonth()+"-"+tn.getDayOfWeek()+"-"+tn.getMonthValue());
        System.out.println(tn.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(tn.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(tn.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        DateTimeFormatter ozel=DateTimeFormatter.ofPattern("EE/MMMM/yyyy/W/ww/F/a/S");
        System.out.println(tn.format(ozel));



    }
}