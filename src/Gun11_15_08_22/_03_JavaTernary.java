package Gun11_15_08_22;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız.
        // tek ise "tek" atayınız ve ekrana stringi yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = oku.nextInt();
        //1.yöntem
        if (sayi % 2 == 0) {
            System.out.println("çift");
        } else {
            System.out.println("Tek");
        }
        // tek satırda yazma yöntemi
        String sonuc = sayi % 2 == 0 ? "Çift" : "Tek";// şart doğru ise ilk tırnak yanlış ise ikinci tırnak çalışır
        System.out.println("sonuc = " + sonuc);
        // direkt so'nun içerisinde kullanımı
        System.out.println((sayi % 2 == 0) ? "Çift" : "Tek");


    }
}
