package Gun09_11_08_22;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // baklava dilimi =  if
        // girilen bir sayı 10'dan büyük ise ekrana 10 büyük yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi = ");
        int sayi= oku.nextInt();

        if (sayi>10) {
            System.out.println("10dan büyük");
        }



    }
}
