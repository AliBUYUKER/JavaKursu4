package Gun10_12_08_22;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal (Lojik) ifadeler
        // && (shift6) , || (alt <) veya

        // girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // depilse uygun sayı girilmedi yazdırınız.

        // hem tek hem pozitif -> (sayi%2==1) && (sayi > 0)

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi= oku.nextInt();

        if (sayi%2==1 && sayi >0){
            System.out.println("uygun sayı girildi");
        }
        else {
            System.out.println("uygun sayı girilmedi");
        }
















    }
}
