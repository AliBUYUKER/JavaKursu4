package Gun44_29_09_22._01_ZamanDigerIslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // kullanıcıdan alınan ve string durumda olan bir time veya tarih 
        // bilgisinin time veya tarih değişkenine çevrilmesi.
        Long startTime=System.currentTimeMillis();//kodun çalışmaya başladığı zaman
        Scanner input=new Scanner(System.in);
        System.out.print("Tarih Giriniz (25 01 2020) = ");
        String strTarih= input.nextLine();
        
        // kullanıcının girecegi formata göre format oluşturduk.
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        
        // Stringin formatı bu formata uygun olmalı. parse ile çevirdik.
        LocalDate tarih=LocalDate.parse(strTarih,f);

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.format(f) = " + tarih.format(f));
        Long finishTime=System.currentTimeMillis();// kodun çalışmasının bittiği zaman
        System.out.println("strTarih = " + (finishTime-startTime)+" ms");// kodun kaç milisaniyede sonuçlandığını veriyor.
        
        
        
    }
}
