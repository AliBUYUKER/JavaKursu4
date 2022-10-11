package Gun08_10_08_22;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı1 Giriniz = ");
        int Sayi1=oku.nextInt();
        System.out.print("Sayı2 Giriniz = ");
        int Sayi2=oku.nextInt();

        System.out.println("(Sayi1==Sayi2) = " + (Sayi1==Sayi2));







    }
}
