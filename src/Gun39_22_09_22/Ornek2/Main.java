package Gun39_22_09_22.Ornek2;

import Gun37_20_09_22._07_Ornek.Utility.MyFunc;

public class Main {
    public static void main(String[] args) {
        Daire di=new Daire(5,"Daire");
        System.out.println(di);
        di.ciz();
        System.out.println("Daire alanı = "+ MyFunc.yuvarla(di.alan()));
        System.out.println("Daire çeveresi = "+MyFunc.yuvarla(di.cevre()));
        Dikdortgen d=new Dikdortgen(3,8,"Dikdörtgen");
        System.out.println("****************************");
        System.out.println(d);
        d.ciz();
        System.out.println("Dikdörtgen alanı = "+MyFunc.yuvarla(d.alan()));
        System.out.println("Dikdörtgen çevresi = "+MyFunc.yuvarla(d.cevre()));
    }
}
