package Gun13_17_08_22;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // kullanıcı 0 değeri girene kadar, girdiği sayıların toplamını bulunuz.
        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        do {
            System.out.print("Sayı giriniz=");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        } while (sayi != 1);
        System.out.println("toplam = " + toplam);


    }
}
