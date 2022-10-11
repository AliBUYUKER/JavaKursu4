package Gun09_11_08_22;

import java.util.Scanner;

public class _05_javaIf {
    public static void main(String[] args) {
        // Girilen bir sayının sadece, birler basamağını yazı ile yazdırınız
        // 1 -> bir    2-> iki
        // TODO : negatif sayı geldiğin de ne yaparız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int Sayi = oku.nextInt();

        int Bir = Sayi % 10;

        if (Bir == 0) {
            System.out.println("Birle basamağı = Sıfır ");
        }
        if (Bir == 1) {
            System.out.println("Birle basamağı = Bir ");
        }
        if (Bir == 2) {
            System.out.println("Birle basamağı = İki ");
        }
        if (Bir == 3) {
            System.out.println("Birle basamağı = Üç ");
        }
        if (Bir == 4) {
            System.out.println("Birle basamağı = Dört ");
        }
        if (Bir == 5) {
            System.out.println("Birle basamağı = Beş ");
        }
        if (Bir == 6) {
            System.out.println("Birle basamağı = Altı ");
        }
        if (Bir == 7) {
            System.out.println("Birle basamağı = Yedi ");
        }
        if (Bir == 8) {
            System.out.println("Birle basamağı = Sekiz ");
        }
        if (Bir == 9) {
            System.out.println("Birle basamağı = Dokuz ");
        }


    }
}
