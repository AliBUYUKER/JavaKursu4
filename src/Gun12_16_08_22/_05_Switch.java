package Gun12_16_08_22;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.(switch kullanınız)
        Scanner oku = new Scanner(System.in);
        System.out.print("1.Sayı= ");
        int sayi1 = oku.nextInt();
        System.out.print("2.Sayı= ");
        int sayi2 = oku.nextInt();
        Scanner str = new Scanner(System.in);
        System.out.println("Toplama için T,\n Çıkarma için Ç,\n Çarpma için P,\n Bölme için B");
        String islem = oku.next();
        switch (islem.toUpperCase()) {
            case "T":
                System.out.println("Toplam= " + (sayi1 + sayi2));
                break;
            case "Ç":
                System.out.println("Çıkarma= " + (sayi1 - sayi2));
                break;
            case "P":
                System.out.println("Çarpma= " + (sayi1 * sayi2));
                break;
            case "B":
                System.out.println("Bölme= " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("hatalı secim");
                break;
        }
    }
}
