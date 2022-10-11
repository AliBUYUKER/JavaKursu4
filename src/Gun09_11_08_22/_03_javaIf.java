package Gun09_11_08_22;

import java.util.Scanner;

public class _03_javaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanının değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.

        Scanner oku =new Scanner(System.in);
        System.out.print("Sayı 1 = ");
        int Sayi1= oku.nextInt();
        System.out.print("Sayi 2 = ");
        int Sayi2= oku.nextInt();

        if (Sayi1>Sayi2){
            System.out.println("Sayı 1 Büyük = "+Sayi1);
        }
        if (Sayi2>Sayi1){
            System.out.println("Sayı 2 Büyük = "+Sayi2);
        }
        if (Sayi1==Sayi2){
            System.out.println("Eşit");
        }

    }
}
