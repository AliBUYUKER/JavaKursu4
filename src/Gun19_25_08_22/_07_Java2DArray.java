package Gun19_25_08_22;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Java2DArray {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra  sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.
        Scanner oku = new Scanner(System.in);
        int[][] dizi = new int[3][2];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(i + "," + j + ".Sayı giriniz =");
                dizi[i][j] = oku.nextInt();
            }
        }
        int sayac = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] % 2 == 1) {
                    sayac++;
                }
            }
        }
        int[] tek = new int[sayac];
        int a = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] % 2 == 1) {
                    tek[a] = dizi[i][j];
                    a++;
                }
            }
        }
        System.out.println(Arrays.deepToString(dizi));// 2D Arrayleri yazdırır.
        System.out.println("Arrays.toString(tek) = " + Arrays.toString(tek));


    }
}
