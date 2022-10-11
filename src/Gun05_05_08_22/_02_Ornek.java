package Gun05_05_08_22;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {

        // girilen bir adı ekrana yazdırınız.
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Adınızı giriniz =");
        String Ad = okuyucu.next(); // next() -> bir kelime okuma için
        System.out.println("ad = " + Ad);
        /*
        oku.Next(): bir kelime okuyor
        oku.nextLine() -> tüm satırı okur
        oku.nextInt() -> İnt değeri okur
        oku.nextByte() -> byte değeri okur
        oku.nextLong() -> long değeri okur
        oku.nextShort() -> Short değeri okur
        oku.nextFloat() -> Float değeri okur
         oku.nextDouble() -> Double değeri okur
        */


    }
}
