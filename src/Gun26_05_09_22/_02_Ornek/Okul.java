package Gun26_05_09_22._02_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        Scanner oku=new Scanner(System.in);
        ArrayList<Ogrenci> Liste=new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            Ogrenci study1 = new Ogrenci();

            System.out.print("Öğrenci Adı =");
            study1.ogrAdi = oku.nextLine();
            System.out.print("Öğrenci Soyadı =");
            study1.ogrSoyadi = oku.nextLine();
            System.out.print("Öğrenci Sınıfı =");
            study1.ogrSinif = oku.nextLine();
            System.out.print("Öğrenci Adres =");
            study1.ogrAdres = oku.nextLine();

            Liste.add(study1);}
        for (Ogrenci study1:Liste){
            System.out.println("study1 = " + study1.ogrAdi);
            System.out.println("study1.ogrSoyadi = " + study1.ogrSoyadi);
            System.out.println("study1.ogrSinif = " + study1.ogrSinif);
            System.out.println("study1.ogrAdres = " + study1.ogrAdres);
        }
    }
}
