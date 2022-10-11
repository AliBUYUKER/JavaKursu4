package Gun26_05_09_22;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        Scanner oku = new Scanner(System.in);
        ArrayList<ogrenci> Liste=new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
        ogrenci study1 = new ogrenci();

        System.out.print("Öğrenci Adı =");
        study1.ogrAdi = oku.nextLine();
        System.out.print("Öğrenci Soyadı =");
        study1.ogrSoyadi = oku.nextLine();
        System.out.print("Öğrenci Sınıfı =");
        study1.ogrSinif = oku.nextLine();
        System.out.print("Öğrenci Adres =");
        study1.ogrAdres = oku.nextLine();

        Liste.add(study1);}
        for (ogrenci study1:Liste){
            System.out.println("study1 = " + study1.ogrAdi);
            System.out.println("study1.ogrSoyadi = " + study1.ogrSoyadi);
            System.out.println("study1.ogrSinif = " + study1.ogrSinif);
            System.out.println("study1.ogrAdres = " + study1.ogrAdres);
        }


    }
}

class ogrenci {
    String ogrAdi;
    String ogrSoyadi;
    String ogrAdres;
    String ogrSinif;


}