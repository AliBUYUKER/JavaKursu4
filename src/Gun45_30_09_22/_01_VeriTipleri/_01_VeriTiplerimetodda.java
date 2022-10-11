package Gun45_30_09_22._01_VeriTipleri;

import java.util.Arrays;

public class _01_VeriTiplerimetodda {
    public static void main(String[] args) {
        int sayi=5;
        sayiArttir(sayi);
        System.out.println("sayi = " + sayi);
        
        sayi=sayiArtti2(sayi);
        System.out.println("sayi = " + sayi);

        // referans tip : referance typ
        int[] dizi={1,2,3};
        diziSifirlama(dizi);
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        //nesne tip, Null alabilen ilkel tip: object typ
        String isim="ismet";
        kelimeSifirla(isim);
        System.out.println("isim = " + isim);
       isim=kelimeSifirla2(isim);
        System.out.println("isim = " + isim);
        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler.
        //Bu kanalda mesaj gönderme iznine sahip değilsin.
        // Eşit mi
        // ilkel tiplerde  == ve equals farketmez değerler karşılaştırılır.
        // Referance ve Nesne tipler için  eşitlik kontorlünde == in manası  referansları aynı mı demek
        //                                                 equals in manası ise değerleri aynı mı demek





    }
    public static void sayiArttir(int sayi){
        sayi=sayi+1;
    }
    public static int sayiArtti2(int sayi){
        sayi=sayi+1;
        return sayi;
    }
    public static void diziSifirlama(int[] dizi){
        dizi[0]=0;
        dizi[1]=0;
        dizi[2]=0;
    }
    public static void kelimeSifirla(String isim){
        isim="";
    }
    public static String kelimeSifirla2(String isim){
        return isim="";
        
    }

}
