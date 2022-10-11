package Gun23_31_08_22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        /*******************************/
        int sayi=5; // tek bir rakam tutabile değişken
        int[] dizi=new  int[20]; // 20 adet sayı tutabilen değişken
        int[][] tablo=new int[20][2]; // 20x2 lik sayı saklayabilen değişken, uzunluk sabit
        // 3 öğrencinin ders notlarını bir değişkende nasıl birleştiririz.
        ArrayList<Integer> matNotlari=new ArrayList<>();// tek bir dersin notları // 1 yaprak
        ArrayList<Integer> fizikNotlari=new ArrayList<>();// tek bir dersin notları // 1 yaprak
        ArrayList<Integer> kimNotlari=new ArrayList<>();// tek bir dersin notları // 1 yaprak


        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizikNotlari.add(30);
        fizikNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // ArrayList in ArrayListi nasıl yaparım.
        ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizikNotlari);
        notlarListesi.add(kimNotlari);
        // bütün ders notları notlar listesinde su anda, yeni ArrayListlerin listesi
        int matbirnot=notlarListesi.get(0).get(0);// 0.listenin 0. elemanı, matın 1. notu
        System.out.println("notlarListesi = " + notlarListesi.get(0));// 0.listeyi verdi.
        System.out.println("notlarListesi = " + notlarListesi.get(1));// 1.listeyi verdi.
        System.out.println("notlarListesi = " + notlarListesi.get(2));// 2.listeyi verdi.
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi.get(i) = " + notlarListesi.get(i));
        }
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }
    }
}
