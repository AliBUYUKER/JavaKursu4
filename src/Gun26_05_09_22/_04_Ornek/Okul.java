package Gun26_05_09_22._04_Ornek;

import java.util.ArrayList;

import static Gun26_05_09_22._04_Ornek.Ogrenci.gecenOgrenciler;

public class Okul {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri yazdırınız.
        //TODO : sınıf ortalamasını bir metodda bulduktan sonra geçen öğrencilerin
        //TODO : aynı metodda isimlerini yazdırınız.
        ArrayList<Ogrenci> liste=new ArrayList<>();
        gecenOgrenciler(liste);


    }
}
