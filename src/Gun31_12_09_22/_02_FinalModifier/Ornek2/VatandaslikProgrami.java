package Gun31_12_09_22._02_FinalModifier.Ornek2;

public class VatandaslikProgrami {// Vatandas isimli bir Class tanımlayınız (fields: isim, tcNo)
    // tcNo değerini int olarak alınız ve nesne oluşturulurken
    // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
    // kontrol için mainde 2 kişi tanımlayınız.
    // tc nonu değiştirilemediğini kontrol ediniz.
    public static void main(String[] args) {
        Vatandas v1=new Vatandas("ali");
        Vatandas v2=new Vatandas("veli");
        Vatandas v3=new Vatandas("ismet");
        Vatandas v4=new Vatandas("ayşe");
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);


    }
}
