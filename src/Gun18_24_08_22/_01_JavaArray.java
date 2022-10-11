package Gun18_24_08_22;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka yeni diziye atayınız.
        // yeni dizi de 0 lar olmasın.(yeni dizinin boyutu tekerin sayısı kadar olsun)
        int[] dizi = new int[10];
        int sayacTek = 0;
        int sayacCift = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            System.out.println(i + 1 + ".dizi = " + dizi[i]);
            if (dizi[i] % 2 == 1) {
                sayacTek++;
            }
            if (dizi[i] % 2 == 0) {
                sayacCift++;
            }
        }
        System.out.println("sayacCift = " + sayacCift);
        System.out.println("sayacTek = " + sayacTek);
        int[] yeniDiziTek = new int[sayacTek];
        for (int j = 0; j < dizi.length; j++) {
            if (dizi[j] % 2 == 1) {
                yeniDiziTek[a] = dizi[j];
                a++;
            }
        }
        int[] yeniDiziCift = new int[sayacCift];
        for (int j = 0; j < dizi.length; j++) {
            if (dizi[j] % 2 == 0) {
                yeniDiziCift[b] = dizi[j];
                b++;
            }
        }

        System.out.println("Arrays.toString(yeniDiziTek) = " + Arrays.toString(yeniDiziTek));
        System.out.println("Arrays.toString(yeniDiziCift) = " + Arrays.toString(yeniDiziCift));


    }
}
