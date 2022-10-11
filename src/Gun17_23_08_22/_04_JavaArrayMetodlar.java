package Gun17_23_08_22;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        // Arrays.toString(dizi)
        String[] isimler={"ahmet","melike","sümeyra","inanç,","mert"};
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        //diziyi komple yazdırdı
        // Array.sort(isimler)
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));
        // a'dan z'ye sıralar
        
        // diziler eşit mi? Array.equals(dizi1,dizi2)
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,3,54};
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c));
        // Arrays.fill -> bütün kutucuklara 7 atar;
        Arrays.fill(c,7);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
        //Arrays.binarySearch(rakamlar, 5)   -> Sıralı dizide aranan elemanın indexi verir
        // aranan elaman birden fazla ise herhangi birini verebilir.
        // esas amacı var mı yok mu kontrolü, var ise indexini verir, yok ise negatif sayı döndürür
        int[]rakamlar={2,7,4,6,5};
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar));
        Arrays.sort(rakamlar);
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar));
        System.out.println("Arrays.binarySearch(rakamlar,7) = " + Arrays.binarySearch(rakamlar,7));
        
        
    }
    
}
