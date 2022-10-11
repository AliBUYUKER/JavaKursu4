package Gun27_06_09_22.Gun27_06_09_22_04_Ornek;

public class EnerjiSA {
    /*
         1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
         2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                  fatura(double))  class tanımlayınız
         3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
         4.Adım  :1 tane müşteri oluşturunuz,
         5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                  tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
         6.Adım  :Ödenecek rakamı(fatura)  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

         ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                 ondan sonra toplam alarak çıkartınız  */
    public static void main(String[] args) {
        System.out.println("EnerjiSA");
        MusteriAdi musteri = new MusteriAdi();
        musteri.name = "Ismet";
        musteri.surname = "Temur";
        musteri.subscriberNumber = 3476666773L;
        musteri.adress = "\nLondon SW1A 1AA,\n United Kingdom/Buckingham Palace";
        musteri.yazdir();
        musteri.hesap=new ElektrikHesabi();
        musteri.hesap.unitPrice=0.8;
        musteri.hesap.firstIndex=53501;
        musteri.hesap.lastIndex=54068;
        musteri.hesap.tax1=0.72;
        musteri.hesap.tax2=1.45;
        musteri.hesap.tax3=3.56;
        musteri.hesap.tax4=18;
        musteri.hesap.fatura();








    }

}
