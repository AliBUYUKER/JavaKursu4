package Gun12_16_08_22;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi1 = ");
        int sayi1 = oku.nextInt();
        System.out.print("Sayi2 = ");
        int sayi2 = oku.nextInt();

        Scanner stroku = new Scanner(System.in);
        System.out.print(" Toplama için T,\n Çıkarma için Ç,\n Çarpma için P,\n Bölme için B giriniz = ");
        String islem = stroku.next();
        if (islem.equals("T")) {
            System.out.println("Sonuç = " + (sayi1 + sayi2));
        }
        if (islem.equals("Ç")) {
            System.out.println("Sonuç = " + (sayi1 - sayi2));
        }
        if (islem.equals("P")) {
            System.out.println("Sonuç = " + (sayi1 * sayi2));
        }
        if (islem.equals("B")) {
            System.out.println("Sonuç = " + (sayi1 / sayi2));
        }
    }
}
