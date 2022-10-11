package Gun05_05_08_22;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
// Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.
        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Sayı1 = ");
        int sayi1 = okuyucu.nextInt();
        System.out.print("Sayı2 =");
        int sayi2 = okuyucu.nextInt();
        System.out.println("Toplam =" + (sayi1 + sayi2));
        int Toplamm = sayi1 + sayi2;
        System.out.println("Toplamm = " + Toplamm);


    }
}
