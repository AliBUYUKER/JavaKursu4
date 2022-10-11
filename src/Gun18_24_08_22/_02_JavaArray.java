package Gun18_24_08_22;

import java.util.Arrays;
import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi, 10 a kadar olan sayılarla random duldurunuz,
        // sonrasında kullancıdan alacağınız bir sayının dizide olup olmadığını
        // var veya yok diyerek yazdırınız.
        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 10);
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        System.out.print("Sayı giriniz =");
        int sayi = oku.nextInt();
        int a = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == sayi) {
                a++;
            }
        }
        if (a > 0) {
            System.out.println("Var");
        } else System.out.println("Yok");
    }
}

