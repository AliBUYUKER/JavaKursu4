package Gun37_20_09_22._07_Ornek;

import Gun37_20_09_22._07_Ornek.Utility.MyFunc;

public class GeometriMain {
    public static void main(String[] args) {
       Dikdortgen d=new Dikdortgen(4,5);
        System.out.println(d.alani(4,5));
        System.out.println(d.cevresi(4,5));
        Kare k=new Kare();
        System.out.println(k.alani(4));
        System.out.println(k.cevresi(4));
        Daire dd=new Daire();
        System.out.println(dd.alani(3));
        System.out.println(dd.cevresi(3));
        double yeniSayi= MyFunc.yuvarla(dd.cevresi(4));
        System.out.println("Daire cevresi = "+yeniSayi);
    }
}
