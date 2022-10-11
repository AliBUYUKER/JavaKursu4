package Gun09_11_08_22;

import java.util.Scanner;

public class _07_javaIf {
    public static void main(String[] args) {
        // Girilen bir sayının birler ve onlar
        // basamağının eşit olup olmadığını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int Sayi= oku.nextInt();
        int Bir=Sayi%10;
        int on = (Sayi/10)%10;

        if (Bir!=on){
            System.out.println("Eşit Değil");
        }
        if (Bir==on){
            System.out.println("Eşit");
        }



    }
}
