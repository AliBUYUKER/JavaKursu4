package Gun23_31_08_22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        // 2 boyutlu bir ArraList i random olarak
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

        ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizikNotlari);
        notlarListesi.add(kimNotlari);
        // notları ekrana ders adlarını bir Arraylistten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız.
        String not="Matematik Notları :";
        int a=0;
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.println( not+ notlarListesi.get(i).get(j)+"\t");
            }
            System.out.println();
            if (i==0){
                not="Fizik Notları :";
            }else not="Kimya Notları :";

        }// ArrayList<String> dersAdlari=new ArrayList<>();
        // dersAdlari.add("Matematik");
        //dersAdlari.add("Fizik");
        //dersAdlari.add("Kimya");
        // ekleme yapıp çağırırız.
        // TODO :  Soru 1 :Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda yazdırınız
        //         Soru 2 :Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.
        //         Soru 3 :Tüm Derslerin Not yani tum notların ortalamasını(double) bir fonksiyonda buldurup mainde yazdırınız.
        //         Soru 4 :En büyük ve en küçük notu bir maın ıcınde bulunuz (fonksiyon zorunlu değil)
        Scanner oku=new Scanner(System.in);
        System.out.printf("0-Mat, 1-Fiz, 2-Kim");
        System.out.print("DersNo=");
        int derNo= oku.nextInt();
         dersnotlariniYazdir(derNo,notlarListesi);// soru 1
    }
    public static void dersnotlariniYazdir(int dersNo,  ArrayList<ArrayList<Integer>> notlarListesi){
        // ders no belli oldğundan dersleri aydıran for a ihtiyacım yok, bu değer belli derNo
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.println(notlarListesi.get(dersNo).get(i));
        }
    }

}
