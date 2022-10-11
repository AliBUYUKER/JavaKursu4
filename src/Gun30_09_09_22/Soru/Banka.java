package Gun30_09_09_22.Soru;

import java.util.Scanner;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int)(direk erişim olmamalı))
    // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşteirinin toplam yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Musteri cus=new Musteri();
        cus.hesapidBelirleme();
        cus.name="İsmet";
        cus.surName="Temur";
        cus.MusteriHesap=new Hesap();
        int secim;
        do {
        System.out.println("        Temur Bank\nSayın "+cus.name+" "+ cus.surName);
        System.out.println("1-Para Yatıma\n2-Para Çekme\n3-Müşteri bilgileri\n4-Hesap hareketleri\n5-Çıkış");
        System.out.print("Yapmak istediğiniz işlemi seçiniz =");
         secim= oku.nextInt();
        switch (secim){
            case 1:cus.MusteriHesap.bakiyeYatirma();break;
            case 2:cus.MusteriHesap.bakiyeCekme();break;
            case 3:System.out.println(cus);cus.MusteriHesap.bakiyeYazdir();break;
            case 4:cus.MusteriHesap.hesapHareketleri();break;
            case 5:System.out.println("Çıkış");
            default:
                System.out.println("Yanlış seçim yaptnız");break;

        }}while (!(secim==5));




    }
}
