package Gun33_14_09_22._01_Ornek;

import Gun33_14_09_22._01_Ornek.Kisi;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi=new Kisi();
        // kisi.ad="ismet";
        //kisi.soyad="temur";
        //kisi.yas=-25;
        kisi.setAd("Ali");
        kisi.setSoyad("Büyüker");
        kisi.yasAta(25);
        System.out.println(kisi.yasVer());
        System.out.println("kisi = " + kisi);

    }
}
