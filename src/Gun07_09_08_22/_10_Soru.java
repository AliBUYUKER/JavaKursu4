package Gun07_09_08_22;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Girilen bir stringdeki nokta sayısını bulunuz
        // orneğin 01.02.20   bu strinde kaç tane nokta vardır.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string giriniz = ");
        String girilen=oku.nextLine();

        int noktali=girilen.length();

        int noktasiz=girilen.replace(".","").length();
        System.out.println("Noktasız Sayı = " + noktasiz);
        int noktaSayisi=noktali-noktasiz;
        System.out.println("Nokta Sayısı = " + noktaSayisi);




    }
}
