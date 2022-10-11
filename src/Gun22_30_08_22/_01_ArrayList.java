package Gun22_30_08_22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array : boyut sayısı belli ve sonradan boyut değiştirilemez.
        int[] dizi=new int[5]; // Array 5 elemsanlı boyutu sonradan değiştirilemiyor.
        // boyutu dinamik olsa, eleman eklendikçe uzasa, sildikçe kısalsa.
        // ArrayList : boyutu başta vermene gerek yok, boyutu 0 başta,
        // eleman ekledikçe artar, sildikçe azalır
        ArrayList<Integer> IntegerList=new ArrayList<>(); // tanılama
        ArrayList<Boolean> booleanList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        // Integer s1=5; // hem sayı hem de içinde fonksiyonlar saklıyor. default null
        //int s2=6; bu hafızada sadece rakam saklayabilen bir değişken. ilkel tip , primitive tip, default 0
        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);
        isimler.add("Ahmet");
        isimler.add("Mehmet");
        isimler.add("Ali");
        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());
        isimler.add(0,"Ayşe");
        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());
        isimler.set(0,"Zeynep");
        System.out.println("isimler = " + isimler);
        isimler.remove("Mehmet");
        System.out.println("isimler = " + isimler);
        isimler.remove(1);
        System.out.println("isimler = " + isimler);
        int indexof=isimler.indexOf("Ali");
        System.out.println("indexof = " + indexof);
        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).equalsIgnoreCase("zeynep"))
                isimler.remove(i);
        }
        System.out.println("isimler = " + isimler);
        System.out.println("isimler = " + isimler.contains("Ali"));
        System.out.println("isimler = " + isimler.subList(0,1));


    }
}
