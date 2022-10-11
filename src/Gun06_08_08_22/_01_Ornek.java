package Gun06_08_08_22;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.
        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        System.out.print("Cadde = ");
        String Cadde = oku.nextLine();
        System.out.print("Sokak = ");
        String Sokak = oku.nextLine();
        System.out.print("Posta Kodu = ");
        int PostaKodu = oku.nextInt();
        System.out.print("Ülke =");
        String ulke = okuInt.nextLine();

        System.out.println("Cadde =" + Cadde + " Sokak =" + Sokak + " posta Kodu =" + PostaKodu + " Ülke =" + ulke);


    }
}
