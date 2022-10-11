package Gun26_05_09_22._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri yazdırınız.
        //TODO : sınıf ortalamasını bir metodda bulduktan sonra geçen öğrencilerin
        //TODO : aynı metodda isimlerini yazdırınız.
        Scanner oku=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        ArrayList<ogrenci> liste=new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ogrenci ogr=new ogrenci();
            System.out.print("Öğrenci Okul Numarası =");
            ogr.okulNo= oku.nextInt();
            System.out.print("Öğrenci Adı Soyadı =");
            ogr.tamAdi=str.nextLine();
            System.out.print("Öğrenci Notu =");
            ogr.notu= oku.nextInt();
            liste.add(ogr);
        }
        for (ogrenci ogr:liste){
            System.out.println("Öğrenci Adı = " + ogr.tamAdi+" Okul No = "+ogr.okulNo+" Okul Notu ="+ogr.notu);
        }
        
    }
}
