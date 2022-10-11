package Gun21_29_08_22;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        enbBul(4,5);


    }

    public static void enb() {
        Scanner oku = new Scanner(System.in);
        System.out.printf("Sayı Giriniz =");
        int sayi1 = oku.nextInt();
        System.out.printf("Sayı Giriniz=");
        int sayi2 = oku.nextInt();
        System.out.println("En Büyük = " + Math.max(sayi1, sayi2));
    }

    public static int enbBul(int sayi1, int sayi2) {
        int donecek = 0;
        donecek = sayi1 > sayi2? sayi1:sayi2;
        return donecek;
    }
}
