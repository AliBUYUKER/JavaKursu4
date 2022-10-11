package Gun17_23_08_22;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _7_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.
        int[] dizi = new int[10];
        int sayac=0;
        int a=0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            System.out.println(i+1+".dizi = " + dizi[i]);
            if (dizi[i] % 2 == 1) {
                sayac++;
            }}
        int[] yeniDizi = new int[sayac];
        for (int j = 0; j < dizi.length ; j++) {
            if (dizi[j] % 2 == 1) {
                yeniDizi[a] = dizi[j];
                a++;
        }}

        System.out.println("Arrays.toString(yeniDizi) = " + Arrays.toString(yeniDizi));

    }
}
