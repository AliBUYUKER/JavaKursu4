package Gun45_30_09_22._02_ExceptionHandling;

import java.time.LocalDate;
import java.time.Month;

public class _02_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program başladı");
        try {
            LocalDate tarih = LocalDate.of(2022, Month.FEBRUARY, 30);
        }catch (Exception ex){
            System.out.println("hata var uleen");
        }
        System.out.println("program bitti");



        /*int a=053;
        if (a==43){
            System.out.println("a= Eşit");
        }*/
        int c=053;
        if (c==053){
            System.out.println("c= Eşit");
        }
    }
}
