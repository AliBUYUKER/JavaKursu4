package Gun31_12_09_22._01_StaticModifier.Ornek1;

import Gun31_12_09_22._01_StaticModifier.Ornek1.Ogrenci;

public class Okul {
    public static void main(String[] args) {
        // Ogrenci ogr1=new Ogrenci("ismet","temur");
        // aynı veriyi 500 kez giriş yapılıyordu, bunu engellemek için , önce cons.

        Ogrenci ogr1=new Ogrenci("ismet","temur");
        Ogrenci ogr2=new Ogrenci("Ali","büyüker");
        Ogrenci ogr3=new Ogrenci("ayşe","yıldız");

        //......
        //......

        Ogrenci ogr499=new Ogrenci("ugur","çolak");
        Ogrenci ogr500=new Ogrenci("tuğser","bayrak");

        // aynı verinin çok kez girişi engellendi
        // aynı verinin hafızada NESNE sayısı kadar tekrarlanması engellendi


    }
}
