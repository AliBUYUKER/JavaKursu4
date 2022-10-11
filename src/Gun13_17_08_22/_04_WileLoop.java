package Gun13_17_08_22;

import java.util.Scanner;

public class _04_WileLoop {
    public static void main(String[] args) {
        // Girilen 20 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz
        Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;


        while (sayac <= 20) {
            System.out.print("Sayı giriniz" + sayac + "= ");
            int sayi = oku.nextInt();
            if (sayi > 0) {
                toplam = toplam + sayi;
            }
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
