package Gun13_17_08_22;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarının
        // toplamını bulunuz.
        Scanner oku = new Scanner(System.in);
        System.out.print("kaça kadar= ");
        int girilen = oku.nextInt();
        int sayac = 1;
        int toplam = 0;
        while (sayac <= girilen) {
            System.out.print(sayac + ".Sayı = ");
            int sayi = oku.nextInt();
            if ((sayi % 2) != 0) {
                toplam = toplam + sayi;

            }
            sayac++;

        } System.out.println("toplam = " + toplam);


    }
}
