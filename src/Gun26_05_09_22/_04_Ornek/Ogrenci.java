package Gun26_05_09_22._04_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogrenci {
    int okulNo;
    String tamAd;
    int not;


    public static void gecenOgrenciler(ArrayList<Ogrenci> liste) {
        Scanner oku = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Ogrenci orn = new Ogrenci();
            System.out.print("Öğrenci adı/soyadı =");
            orn.tamAd = str.nextLine();
            System.out.print("Öğrenci Okul no =");
            orn.okulNo = oku.nextInt();
            System.out.print("Öğrenci Not =");
            orn.not = oku.nextInt();
            liste.add(orn);
        }
        int toplam = 0;
        for (Ogrenci study : liste) {
            toplam = (toplam + study.not);
        }
        int ort = toplam / liste.size();
        for (Ogrenci ogrr : liste) {
            if (ogrr.not >= ort) {
                System.out.println("ogrr.tamAd = " + ogrr.tamAd);
            }
        }


    }
}

